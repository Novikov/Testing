package com.raywenderlich.android.wishlist.persistence

import com.raywenderlich.android.wishlist.Wishlist
import java.util.*
import java.util.concurrent.ThreadLocalRandom

//Вспомогательный класс для работы с БД
//Он генерит рандомные данные, чтобы мы не затачивали тесты под конкретные WishLists
object WishlistFactory {
    private fun makeRandomString() = UUID.randomUUID().toString()
    private fun makeRandomInt() =
            ThreadLocalRandom.current().nextInt(0, 1000 + 1)

    fun makeWishlist(): Wishlist {
        return Wishlist(
                makeRandomString(),
                listOf(makeRandomString(), makeRandomString()),
                makeRandomInt())
    }
}