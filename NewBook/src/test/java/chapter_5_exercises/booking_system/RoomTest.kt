package chapter_5_exercises.booking_system

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import java.lang.IllegalArgumentException
import java.util.*

class RoomTest {

    lateinit var sut: Room

    @Before
    fun setup(){
        sut = Room("A1")
    }

    @Test
    fun `Room should have booking behaviour`(){
        val bookedTime = BookedTime(GregorianCalendar(2020, 12 , 10),listOf(17,18,19))
        val listOfEquipment = listOf(Equipment.Microphone,Equipment.Projector)
        sut.book(bookedTime,listOfEquipment)
        assertTrue(sut.roomInfo[bookedTime]!=null)
    }

    @Test
    fun `Room should check availability of itself`(){
        val bookedTime = BookedTime(GregorianCalendar(2020, 12 , 10),listOf(17,18,19))
        val anotherTime = BookedTime(GregorianCalendar(2020, 12 , 10),listOf(17,18,19))
        val listOfEquipment = listOf(Equipment.Microphone,Equipment.Projector)
        sut.book(bookedTime,listOfEquipment)
        assertFalse(sut.isAvailable(bookedTime))
        assertTrue(sut.isAvailable(anotherTime))
    }

    @Test(expected = IllegalArgumentException::class)
    fun `if room already booked it shouldn't book itself`(){
        val bookedTime = BookedTime(GregorianCalendar(2020, 12 , 10),listOf(17,18,19))
        sut.book(bookedTime)
        sut.book(bookedTime)
    }

}