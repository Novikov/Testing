package chapter_5_exercises.booking_system

import java.time.DayOfWeek
import java.util.*

class BookedTime(val dayOfWeek: GregorianCalendar, val time:List<Int>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BookedTime

        if (dayOfWeek != other.dayOfWeek) return false
        if (time != other.time) return false

        return true
    }

    override fun hashCode(): Int {
        var result = dayOfWeek.hashCode()
        result = 31 * result + time.hashCode()
        return result
    }
}