package com.raywenderlich.android.cocktails.common.repository

import android.content.SharedPreferences
import com.nhaarman.mockitokotlin2.*
import com.raywenderlich.android.cocktails.common.network.CocktailsApi
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class RepositoryUnitTests{
    private lateinit var repository: CocktailsRepository
    @Mock
    private lateinit var api: CocktailsApi
    @Mock
    private lateinit var sharedPreferences: SharedPreferences
    @Mock
    private lateinit var sharedPreferencesEditor:
            SharedPreferences.Editor

    @Before
    fun setup() {
//        api = mock()
//        sharedPreferences = mock()
//        sharedPreferencesEditor = mock()
        //вместо этого можно использовать аннотации
        whenever(sharedPreferences.edit())
                .thenReturn(sharedPreferencesEditor)
        repository = CocktailsRepositoryImpl(api, sharedPreferences)
    }


    //Verifying in order
    @Test
    fun saveScore_shouldSaveToSharedPreferences() {
        val score = 100
        repository.saveHighScore(score)

        //проверка в каком порядке вызываются методы
        inOrder(sharedPreferencesEditor) {
            verify(sharedPreferencesEditor).putInt(any(), eq(score))
            verify(sharedPreferencesEditor).apply()
        }
    }

    @Test
    fun getScore_shouldGetFromSharedPreferences() {
        repository.getHighScore()
        verify(sharedPreferences).getInt(any(), any())
    }

    //Spying
    @Test
    fun saveScore_shouldNotSaveToSharedPreferencesIfLower() {
        val previouslySavedHighScore = 100
        val newHighScore = 10
        val spyRepository = spy(repository)

        //stubbing getHighScore(). Данный метод всегда будет возвращать previouslySavedHighScore = 100
        doReturn(previouslySavedHighScore)
                .whenever(spyRepository)
                .getHighScore()

        //Вызов реального метода класса
        spyRepository.saveHighScore(newHighScore)
        //проверка того, что при данном условии никогда не вызовется метод putInt по ссылке sharedPreferencesEditor
        verify(sharedPreferencesEditor, never()).putInt(any(), eq(newHighScore))
        //шпион нужно использовать т.к мы хотим убедиться, что вызывается внутренний метод насколько я понял.
    }

}