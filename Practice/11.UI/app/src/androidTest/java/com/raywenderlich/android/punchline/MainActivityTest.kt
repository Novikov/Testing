package com.raywenderlich.android.punchline

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.javafaker.Faker
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Single
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.test.KoinTest
import org.koin.test.inject
import org.koin.test.mock.declareMock


@RunWith(AndroidJUnit4::class)
class MainActivityTest : KoinTest {

    private val mockRepository: Repository by inject()
    private var faker = Faker()

    @Before
    fun setUp() {
        declareMock<Repository>()
    }

    @Test
    fun onLaunchButtonIsDisplayed() {
        whenever(mockRepository.getJoke())
                .thenReturn(Single.just(Joke(
                        faker.idNumber().valid(),
                        faker.lorem().sentence())))

        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.buttonNewJoke))
                .check(matches(isDisplayed()))
    }

    @Test
    fun onLaunchJokeIsDisplayed() {
        val joke = Joke(
                faker.idNumber().valid(),
                faker.lorem().sentence())
        whenever(mockRepository.getJoke())
                .thenReturn(Single.just(joke))

        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.textJoke))
                .check(matches(withText(joke.joke)))
    }

    @Test
    fun onButtonClickNewJokeIsDisplayed() {
        whenever(mockRepository.getJoke())
                .thenReturn(Single.just(Joke(
                        faker.idNumber().valid(),
                        faker.lorem().sentence())))

        ActivityScenario.launch(MainActivity::class.java)

        val joke = Joke(
                faker.idNumber().valid(),
                faker.lorem().sentence())

        whenever(mockRepository.getJoke())
                .thenReturn(Single.just(joke))

        onView(withId(R.id.buttonNewJoke))
                .perform(click())

        onView(withId(R.id.textJoke))
                .check(matches(withText(joke.joke)))
    }
}