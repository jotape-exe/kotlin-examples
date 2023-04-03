package basic.collectionskt

val enrollments = mutableSetOf<Long>(32132, 54353, 65456, 54353)
val readEnrollmets:Set<Long> = enrollments//ReadOnly

fun main() {
    println(readEnrollmets)

    println(enrollments.add(32132))
    println(enrollments.add(54389))

    println(readEnrollmets)
}