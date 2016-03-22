data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(other: MyDate): Int = compare(this, other)
}

fun compare(date1: MyDate, date2: MyDate): Int = when {
    date1.year != date2.year -> date1.year - date2.year
    date1.month != date2.month -> date1.month - date2.month
    else -> date1.dayOfMonth - date2.dayOfMonth
}