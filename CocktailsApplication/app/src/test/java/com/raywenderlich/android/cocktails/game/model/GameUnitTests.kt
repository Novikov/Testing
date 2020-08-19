package com.raywenderlich.android.cocktails.game.model

import com.nhaarman.mockitokotlin2.*
import org.junit.Assert
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito.mock

class GameUnitTests {

    //Mocking and verifying
    /*Verify the method answer() was called on the Question mock. You used the
    times(1) verification mode to check that the answer() method was called
    exactly one time. You also used the eq argument matcher to check that the
    answer() method was called with a String equal to OPTION .*/
    @Test
    fun whenAnswering_shouldDelegateToQuestion() {
        val question = mock<Question>()
        val game = Game(listOf(question))
        game.answer(question, "OPTION")
//        verify(question, times(1)).answer(eq("OPTION"))
        verify(question).answer(eq("OPTION"))
    }

    //Stubbing methods

    @Test
    fun whenAnsweringCorrectly_shouldIncrementCurrentScore() {
        val question = mock<Question>()
        whenever(question.answer(anyString())).thenReturn(true)
        val score = mock<Score>()
        val game = Game(listOf(question), score)
        game.answer(question, "OPTION")
        //проверка того, что вызывается метод increment по ссылке score
        verify(score).increment()
    }



    @Test
    fun whenAnsweringIncorrectly_shouldNotIncrementCurrentScore() {
        val question = mock<Question>()
        whenever(question.answer(anyString())).thenReturn(false)
        val score = mock<Score>()
        val game = Game(listOf(question), score)
        game.answer(question, "OPTION")
        //проверка того, что не вызывается метод increment по ссылке score
        verify(score, never()).increment()
    }


}

