fun main() {
    val members : Array<String> = arrayOf("Pendi","Alif","Fikri")
    val Pendi: String = members[0]
    val Alif : String = members.get(1)
    val Fikri : String = members.get(2)

    val values : Array<Byte> = arrayOf(100,95,90)
    val balances : Array<Int> = arrayOf(10_000, 15_000, 20_000)

    //memanggil data
    println("___Memanggil data array!!!___")
    println(values[0])
    println(Pendi)
    println(Alif)
    println(Fikri)

    //mengubah data array
    println("___Mengubah data array!!!___")
    members.set(0,"Fikri")
    values.set(0,95)

    println(members[0])
    println(values[0])

    //Array null
    println("___Belajar Array null!!!___")
    val buah: Array<String?> = arrayOfNulls(4)
    buah.set(0,"Anggur")
    buah.set(1,null)
    buah.set(2,"Apel")
    buah.set(3,null)

    println(buah[0])
    println(buah[1])
    println(buah[2])
    println(buah[3])

    //Array tanpa String
    println("___Array tanpa string___")
    val hewan = arrayOf(1,2,"ss")
    println(hewan[2])
    println(hewan[0])



}