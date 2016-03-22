class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(d: MyDate): Boolean {
        if (d.compareTo(start) >= 0 && d.compareTo(endInclusive) <= 0) {
            return true;
        } else {
            return false
        }
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}