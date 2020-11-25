package chapter_4_exercises

class BookingSystem {
    private val rooms = mutableMapOf<String,MutableSet<Int>>(
            Pair("A1", mutableSetOf()),
            Pair("A2", mutableSetOf()),
            Pair("A3", mutableSetOf()),
            Pair("A4", mutableSetOf()),
            Pair("A5", mutableSetOf())
    )

    fun bookRoom(roomName: String, requiredHours: HashSet<Int>) {
        checkHours(roomName, requiredHours)
        for(requireHour in requiredHours){
            rooms[roomName]?.add(requireHour)
        }
    }

    private fun checkHours(roomName: String,requiredHours: HashSet<Int>) {
        requiredHours.forEach {
            if (it !in 1..24) {
                throw IllegalArgumentException("Booked hours should be in range 1 - 24")
            }

            if (rooms[roomName]!!.contains(it)){
                throw Exception("This hour already booked")
            }

        }
    }

    fun getListOfBookedHours(roomName :String): Set<Int> {
        return rooms[roomName]?: setOf()
    }
}