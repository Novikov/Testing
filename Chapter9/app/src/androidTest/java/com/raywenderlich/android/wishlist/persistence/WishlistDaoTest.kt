package com.raywenderlich.android.wishlist.persistence

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.raywenderlich.android.wishlist.Wishlist
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor

@RunWith(AndroidJUnit4::class)
class WishlistDaoTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var wishlistDatabase: WishlistDatabase
    private lateinit var wishlistDao: WishlistDao

    //in memory database - копия базы данных, чтобы не потерять данные БД
    @Before
    fun initDb() {
        wishlistDatabase = Room.inMemoryDatabaseBuilder(
                InstrumentationRegistry.getInstrumentation().context,
                WishlistDatabase::class.java).build()
                wishlistDao = wishlistDatabase.wishlistDao()


    }

    //Бесполезный тест. Нужно тестировать взаимодействие классов, а не библиотеку.
    //Какой смысл от проверки того, что пуста БД вернет пустой лист объектов?
    @Test
    fun getAllReturnsEmptyList() {
        val testObserver: Observer<List<Wishlist>> = mock()
        wishlistDao.getAll().observeForever(testObserver)
        //Проверка того, что при попадании данных в observer - эти данные пустой лист
        verify(testObserver).onChanged(emptyList())
    }

    //Testing an insert
    //Проверка того, что вставка данных произшла. Сам факт.
    @Test
    fun saveWishlistsSavesData() {
        val wishlist1 = WishlistFactory.makeWishlist()
        val wishlist2 = WishlistFactory.makeWishlist()
        wishlistDao.save(wishlist1, wishlist2)
        val testObserver: Observer<List<Wishlist>> = mock()
        wishlistDao.getAll().observeForever(testObserver)

        val listClass = ArrayList::class.java as Class<ArrayList<Wishlist>>
        val argumentCaptor = ArgumentCaptor.forClass(listClass)
        verify(testObserver).onChanged(argumentCaptor.capture())
        assertTrue(argumentCaptor.value.size > 0)
    }

    //Testing your query
    //Проверка того, что то, что данные которые мы положили в БД соответствуют возращаемым данным
    @Test
    fun getAllRetrievesData() {
        val wishlist1 = WishlistFactory.makeWishlist()
        val wishlist2 = WishlistFactory.makeWishlist()
        wishlistDao.save(wishlist1, wishlist2)
        val testObserver: Observer<List<Wishlist>> = mock()
        wishlistDao.getAll().observeForever(testObserver)

        val listClass =
                ArrayList::class.java as Class<ArrayList<Wishlist>>
        val argumentCaptor = ArgumentCaptor.forClass(listClass)
        verify(testObserver).onChanged(argumentCaptor.capture())
        val capturedArgument = argumentCaptor.value
        assertTrue(capturedArgument
                .containsAll(listOf(wishlist1, wishlist2)))
    }

    //Проверка корректности порядка вставки данных.
    @Test
    fun findByIdRetrievesCorrectData() {
        val wishlist1 = WishlistFactory.makeWishlist()
        val wishlist2 = WishlistFactory.makeWishlist()
        wishlistDao.save(wishlist1, wishlist2)

        val testObserver: Observer<Wishlist> = mock()
        wishlistDao.findById(wishlist2.id).observeForever(testObserver)
        verify(testObserver).onChanged(wishlist2)
    }


    @After
    fun closeDb() {
        wishlistDatabase.close()
    }
}