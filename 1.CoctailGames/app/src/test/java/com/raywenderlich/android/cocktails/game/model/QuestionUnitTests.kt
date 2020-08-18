package com.raywenderlich.android.cocktails.game.model

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class QuestionUnitTests {

    private lateinit var question: Question
    //Данный код будет вызываться перед каждым тестом.
    @Before
    fun setup() {
        question = Question("CORRECT", "INCORRECT")
    }

    //критерий выполнения - null
    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption() {
        Assert.assertNull(question.answeredOption)
    }

    //критерий выполнения - совпадение строк
    @Test
    fun whenAnswering_shouldHaveAnsweredOption() {
        question.answer("INCORRECT")
        Assert.assertEquals("INCORRECT", question.answeredOption)
    }

    //критерий выполнения - true
    @Test
    fun whenAnswering_withCorrectOption_shouldReturnTrue() {
        val result = question.answer("CORRECT")
        Assert.assertTrue(result)
    }

    //критерий выполнения - false
    @Test
    fun whenAnswering_withIncorrectOption_shouldReturnFalse() {
        val result = question.answer("INCORRECT")
        Assert.assertFalse(result)
    }

    //критерий выполнения - вброс указанного исключения
    @Test(expected = IllegalArgumentException::class)
    fun whenAnswering_withInvalidOption_shouldThrowException() {
        question.answer("INVALID")
    }



}
