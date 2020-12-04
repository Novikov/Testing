package chapter_5_exercises.booking_system

import java.util.*

open class Room(var roomName:String) {

    val roomInfo = mapOf<GregorianCalendar,List<Pair<BookedTime,List<Equipment>>>>()

    open fun getTitle():String{
        return roomName
    }

    open fun book(bookedTime: BookedTime, listOfEquipment: List<Equipment>){
        roomInfo[bookedTime.dayOfWeek]?.forEach {
           if (it.first == bookedTime){
               throw IllegalArgumentException("Room already booked for this time")
           }
        }
    }
}