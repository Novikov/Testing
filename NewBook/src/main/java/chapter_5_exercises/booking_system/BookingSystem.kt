package chapter_5_exercises.booking_system

class BookingSystem(private val rooms:List<Room>) {

    fun bookRoom(roomIndex: Int, requiredHours: HashSet<Int>) {
        checkHours(requiredHours)
        for(requireHour in requiredHours){
            if (rooms[roomIndex].isAvaliable(requireHour)){
                rooms[roomIndex].bookHour(requireHour)
            }
        }
    }

    private fun checkHours(requiredHours: HashSet<Int>) {
        requiredHours.forEach {
            if (it !in 1..24) {
                throw IllegalArgumentException("Booked hours should be in range 1 - 24")
            }

        }
    }

    fun getListOfBookedHours(roomIndex :Int): List<Int> {
        return rooms[roomIndex].getListOfBookedHours()
    }

    fun getListOfExistingRooms():List<Room> {
        return rooms
    }
}