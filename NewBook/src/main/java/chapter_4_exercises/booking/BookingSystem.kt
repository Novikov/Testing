package chapter_4_exercises.booking

class BookingSystem {
    private val rooms = mutableListOf(
            Room("A1"),
            Room("A2"),
            Room("A3"),
            Room("A4"),
            Room("A5")
    )


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