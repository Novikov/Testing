package chapter_5_exercises.booking_system

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class BookingSystemTest{
   lateinit var room1:Room
   lateinit var room2:Room
   lateinit var room3:Room

    lateinit var bookingSystem:BookingSystem

    @Before
    fun setUp(){
        room1 = mock(Room::class.java)
        room2 = mock(Room::class.java)
        room3 = mock(Room::class.java)
        Mockito.`when`(room1.getTitle()).thenReturn("A1")
        Mockito.`when`(room2.getTitle()).thenReturn("A2")
        Mockito.`when`(room3.getTitle()).thenReturn("A3")

        bookingSystem = BookingSystem(listOf(room1,room2,room3))

//        Mockito.`when`(bookingSystem.getListOfExistingRooms()).thenReturn(listOf(room1,room2,room3))

    }

    @Test
    fun `Booking system should return list of existing rooms`(){
        bookingSystem.getListOfExistingRooms()
        verify(bookingSystem.getListOfExistingRooms())
    }




}