package chapter_5_exercises.booking_system

import java.util.*

open class Room(var roomName:String) {

    val roomInfo = mutableMapOf<GregorianCalendar,List<Pair<BookedTime,List<Equipment>?>>>()

    open fun getTitle():String{
        return roomName
    }

    open fun book(bookedTime: BookedTime, listOfEquipment: List<Equipment>? = null){
        if (isAvaliable(bookedTime)){
            roomInfo[bookedTime.dayOfWeek] = listOf(Pair(bookedTime,listOfEquipment))
        }
        else {
            throw IllegalArgumentException("Room $roomName already booked for this time")
        }
    }

    fun isAvaliable(bookedTime: BookedTime):Boolean {
        var isAvailable = false
        roomInfo[bookedTime.dayOfWeek]?.forEach {
            if (it.first.equals(bookedTime)){
                isAvailable = true
            }
        }
        return isAvailable
    }
}