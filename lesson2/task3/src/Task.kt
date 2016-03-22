operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate> {
    override fun contains(value: MyDate): Boolean {
        return start <= value && value <= endInclusive
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}