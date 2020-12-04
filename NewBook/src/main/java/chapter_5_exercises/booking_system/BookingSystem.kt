package chapter_5_exercises.booking_system

import java.util.logging.Level
import java.util.logging.Logger

open class BookingSystem(val rooms:List<Room>) {

    fun getListOfExistingRooms():List<Room> {
        return rooms
    }

    fun book(roomName: String, bookedTime: BookedTime, listOfEquipment: List<Equipment>) {
        var room:Room? = null
        rooms.forEach {
//            print("${it.getTitle()} - $roomName - ${it.getTitle().equals(roomName).toString()}\n")
            if (it.getTitle().equals(roomName)){
             room = it
            }
        }
        if (room == null){
            throw IllegalArgumentException("Room $roomName doesn't exists")
        }
    }
}