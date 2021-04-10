package chapter_5_exercises.booking_system

open class BookingSystem(val rooms:List<Room>) {

    fun getListOfExistingRooms():List<Room> {
        return rooms
    }

    fun book(roomName: String, bookedTime: BookedTime, listOfEquipment: List<Equipment>? = null) {
        var room:Room? = null
        rooms.forEach {
            if (it.getTitle().equals(roomName)){
             room = it
            }
        }
        if (room == null){
            throw IllegalArgumentException("Room $roomName doesn't exists")
        }
        else {
            room!!.book(bookedTime,listOfEquipment)
        }
    }

    fun getListOfAvaliableRoomes(time: BookedTime): List<Room> {
        val resultList = mutableListOf<Room>()
        rooms.forEach {
            if (it.isAvailable(time)){
                resultList.add(it)
            }
        }
        return resultList
    }
}