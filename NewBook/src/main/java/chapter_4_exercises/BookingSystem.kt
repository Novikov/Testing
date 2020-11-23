package chapter_4_exercises

class BookingSystem {

    private val freeHours = mutableSetOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24)
    private val bookedHours = mutableSetOf<Int>()

    fun bookHours(requiredHours: HashSet<Int>) {
        checkHours(requiredHours)
        for(requireHour in requiredHours){
                    bookedHours.add(requireHour)
                    freeHours.remove(requireHour)
        }
    }

    private fun checkHours(requiredHours: HashSet<Int>) {
        requiredHours.forEach {
            if (it !in 0..24) {
                throw IllegalArgumentException("Booked hours should be in range 1 - 24")
            }
        }
    }

    fun getListOfBookedHours(): Set<Int> {
        return bookedHours
    }
}