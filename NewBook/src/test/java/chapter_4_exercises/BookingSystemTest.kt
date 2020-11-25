package chapter_4_exercises

import junitparams.JUnitParamsRunner
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Exception

@RunWith(JUnitParamsRunner::class)
class BookingSystemTest {
    lateinit var bookingSystem:BookingSystem

    @Before
    fun `Before each test`(){
        bookingSystem = BookingSystem()
    }

    @Test
    fun `Booking system should return list of booked hours`() {
        bookingSystem.bookRoom("A1",hashSetOf(10,11))
        assertEquals(setOf(10,11), bookingSystem.getListOfBookedHours("A1"))
    }

    @Test(expected = Exception::class)
    fun `Booking system shouldn't allow double book a particular hour`(){
        bookingSystem.bookRoom("A1", hashSetOf(10))
        bookingSystem.bookRoom("A1", hashSetOf(10))
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Booking system throw IllegalArgumentException if arguments wont be in range until 1 to 24`(){
        bookingSystem.bookRoom("A1", hashSetOf(25))
    }

}