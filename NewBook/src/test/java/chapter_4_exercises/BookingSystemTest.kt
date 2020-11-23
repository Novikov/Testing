package chapter_4_exercises

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.verify

@RunWith(JUnitParamsRunner::class)
class BookingSystemTest {
    lateinit var bookingSystem:BookingSystem

    @Before
    fun `Before each test`(){
        bookingSystem = BookingSystem()
    }

    @Test
    fun `Booking system should return list of booked hours`() {
        bookingSystem.bookHours(hashSetOf(10,11))
        assertEquals(setOf(10,11), bookingSystem.getListOfBookedHours())
    }

    @Test
    fun `Booking system shouldn't allow double book a particular hour`(){
        bookingSystem.bookHours(hashSetOf(10))
        assertEquals(setOf(10),bookingSystem.getListOfBookedHours())
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Booking system throw IllegalArgumentException if arguments wont be in range until 1 to 24`(){
        bookingSystem.bookHours(hashSetOf(25))
    }




}