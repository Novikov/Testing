package com.raywenderlich.android.cocktails.game.model

class Question(val correctOption: String, val incorrectOption: String) {
    val isAnsweredCorrectly: Boolean
        get() = correctOption == answeredOption

    var answeredOption: String? = null
        private set

    fun answer(option: String):Boolean {
        if (option != correctOption && option != incorrectOption)
            throw IllegalArgumentException("Not a valid option")
        answeredOption = option
        return isAnsweredCorrectly
    }
}