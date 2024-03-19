import java.util.concurrent.atomic.AtomicLongArray

fun main() {
var friends = arrayOf("Mary","Esther","Rehema","Funani","Dame")
    println(friends.contentToString())
    println(friends.contentToString())
    println(friends[2])

    friends=friends.plus("Aisha")
    println(friends.contentToString())
    friends=friends.plus(arrayOf("Shiamagovi","Abee"))
    println(friends.contentToString())

    addition(arrayOf(1,2,3,4,5))

    var students=arrayOf(arrayOf("aisha","maureen"), arrayOf("githeri","chapati"))
    println(students.contentDeepToString())
    students=students.plus(arrayOf("haa","oiuyy"))
    println(students.contentDeepToString())



}
fun addition( numbers:Array<Int?>) {
    println(numbers.size)

    println(numbers[0])
    println(numbers.count())
    println(numbers.get(4))
    println(numbers.slice(0..2))
    println(numbers.slice(1..3))
    println(numbers.slice(0..3))
    println(numbers.indexOf(0))
    println(numbers.indexOf(4))
    numbers[2] = null
    println(numbers.contentToString())




}



