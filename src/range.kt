fun main () {
    val range1 = 0..1000 step 2
    val range2 = 1000 downTo 0 step 5

    println(range1)
    println(range2)
    println("=========1===========")
    println(range1.count())
    println(range1.contains(12))
    println(range1.first)
    println(range1.last)
    println(range1.step)
    println("=========2===========")
    println(range2.count())
    println(range2.contains(20))
    println(range2.first)
    println(range2.last)
    println(range2.step)


    println("====for====")
    for (i in 1..10) {
        println(" data ke-$i=$i")
    }
    for (i in 1 until 10) {
        println("data ke-$i=$i")
    }

}