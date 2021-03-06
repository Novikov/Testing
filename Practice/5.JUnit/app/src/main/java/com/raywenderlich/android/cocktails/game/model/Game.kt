package com.raywenderlich.android.cocktails.game.model

class Game(highest: Int) {
    var highestScore = highest
        private set
    var currentScore = 0
        private set

    fun incrementScore(){
        currentScore++
        if (currentScore > highestScore) {
            highestScore = currentScore
        }
    }
}