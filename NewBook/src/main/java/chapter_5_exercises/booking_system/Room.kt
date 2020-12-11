package chapter_5_exercises.booking_system

import java.util.*

open class Room(var roomName:String) {

    val roomInfo = mutableMapOf<BookedTime,List<Equipment>?>()

    open fun getTitle():String{
        return roomName
    }

    open fun book(bookedTime: BookedTime, listOfEquipment: List<Equipment>? = null){
        if (isAvailable(bookedTime)){
            roomInfo.put(bookedTime,listOfEquipment)
        }
        else {
            throw IllegalArgumentException("Room $roomName already booked for this time")
        }
    }

    open fun isAvailable(bookedTime: BookedTime):Boolean {
        return !roomInfo.containsKey(bookedTime)
    }
}