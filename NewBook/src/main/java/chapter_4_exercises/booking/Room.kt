package chapter_4_exercises.booking

import java.lang.Exception

class Room(val roomName:String) {
    private val bookedHours:MutableSet<Int> = mutableSetOf()

    fun isAvaliable(hour:Int):Boolean{
       return !bookedHours.contains(hour)
    }

    fun bookHour(hour:Int){
        if (bookedHours.contains(hour)){
            throw Exception("Room already booked for this time")
        }
        bookedHours.add(hour)
    }

    fun getListOfBookedHours():List<Int>{
        return bookedHours.asIterable().toList()
    }
}