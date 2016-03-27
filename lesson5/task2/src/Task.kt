import java.util.HashMap

fun <K, V> buildMap(build: MutableMap<K, V>.() -> Unit): Map<K, V> {
    val map: MutableMap<K, V> = hashMapOf()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}