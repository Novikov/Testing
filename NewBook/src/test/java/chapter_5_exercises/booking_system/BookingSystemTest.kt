package chapter_5_exercises.booking_system

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import java.util.*

class BookingSystemTest{
   lateinit var room1:Room
   lateinit var room2:Room
   lateinit var room3:Room

    lateinit var bookingSystem:BookingSystem
    lateinit var listOfRooms:List<Room>


    private companion object {
        const val RoomName1 = "A1"
        const val RoomName2 = "A2"
        const val RoomName3 = "A3"
    }

    @Before
    fun setUp(){
        room1 = mock(Room::class.java)
        room2 = mock(Room::class.java)
        room3 = mock(Room::class.java)
        `when`(room1.getTitle()).thenReturn(RoomName1)
        `when`(room2.getTitle()).thenReturn(RoomName2)
        `when`(room3.getTitle()).thenReturn(RoomName3)
        listOfRooms = listOf(room1,room2,room3)
        bookingSystem = BookingSystem(listOfRooms)
    }

    @Test
    fun `Booking system should return list of existing rooms`(){
        assertEquals(listOfRooms,bookingSystem.getListOfExistingRooms())
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Booking system should book only exist rooms`(){
        val bookedTime = BookedTime(GregorianCalendar(2020, 12 , 10),listOf(17,18,19))
        val listOfEquipment = listOf(Equipment.Microphone,Equipment.Projector)
        bookingSystem.book("A4",bookedTime,listOfEquipment)
    }

    @Test
    fun `Booking system should book rooms`(){
        val bookedTime = BookedTime(GregorianCalendar(2020, 12 , 10),listOf(17,18,19))
        val listOfEquipment = listOf(Equipment.Microphone,Equipment.Projector)
        bookingSystem.book("A1",bookedTime,listOfEquipment)
        verify(room1).book(bookedTime,listOfEquipment)
    }

    @Test
    fun `Booking system should return list all available classrooms for a given day and hourly time slot`(){
        val bookedTime1 = BookedTime(GregorianCalendar(2020, 12 , 1),listOf(17,18,19))
        val bookedTime2 = BookedTime(GregorianCalendar(2020, 12 , 2),listOf(17,18,19))
        val bookedTime3 = BookedTime(GregorianCalendar(2020, 12 , 3),listOf(17,18,19))
        val bookedTime4 = BookedTime(GregorianCalendar(2020, 12 , 4),listOf(17,18,19))
        val bookedTime5 = BookedTime(GregorianCalendar(2020, 12 , 4),listOf(13,14,15))
        `when`(room1.isAvailable(bookedTime1)).thenReturn(false)
        `when`(room2.isAvailable(bookedTime2)).thenReturn(false)
        `when`(room3.isAvailable(bookedTime3)).thenReturn(false)
        `when`(room2.isAvailable(bookedTime4)).thenReturn(false)

        `when`(room1.isAvailable(bookedTime5)).thenReturn(true)
        `when`(room2.isAvailable(bookedTime5)).thenReturn(true)
        `when`(room3.isAvailable(bookedTime5)).thenReturn(false)
        `when`(room2.isAvailable(bookedTime5)).thenReturn(true)

        assertEquals(2,bookingSystem.getListOfAvaliableRoomes(bookedTime5).size)
    }

}

