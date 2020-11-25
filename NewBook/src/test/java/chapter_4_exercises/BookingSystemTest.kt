package chapter_4_exercises

import chapter_4_exercises.booking.BookingSystem
import junitparams.JUnitParamsRunner
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class BookingSystemTest {
    lateinit var bookingSystem: BookingSystem

    @Before
    fun `Before each test`(){
        bookingSystem = BookingSystem()
    }

    @Test
    fun `Booking system should return list of booked hours`() {
        bookingSystem.bookRoom(0,hashSetOf(10,11))
        assertEquals(listOf(10,11), bookingSystem.getListOfBookedHours(0))
    }

    @Test
    fun `Booking system shouldn't allow double book a particular hour`(){
        bookingSystem.bookRoom(0, hashSetOf(10))
        bookingSystem.bookRoom(0, hashSetOf(10))
        assertEquals(listOf(10),bookingSystem.getListOfBookedHours(0))
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Booking system throw IllegalArgumentException if arguments wont be in range until 1 to 24`(){
        bookingSystem.bookRoom(0, hashSetOf(25))
    }
}