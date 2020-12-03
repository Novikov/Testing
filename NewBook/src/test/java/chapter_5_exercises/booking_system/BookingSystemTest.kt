package chapter_5_exercises.booking_system

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.*

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


}