import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

data class RepeatedTimeInterval (val timeInterval: TimeInterval, val repeated: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(timeInterval: RepeatedTimeInterval): MyDate =
        this.addTimeIntervals(timeInterval.timeInterval, timeInterval.repeated)

operator fun TimeInterval.times(number: Int): RepeatedTimeInterval = RepeatedTimeInterval(this, number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}