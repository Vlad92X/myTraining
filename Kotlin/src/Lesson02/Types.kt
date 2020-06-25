//некоторые эксперементы и проверки возможностей


val b: Byte =12
val l= b+ 123L


/*
var  someString:String ="some string"
val someStringOrNull :String?="some string, but may be null"
var someStringOrNullMutable:String?=null
var someInt:Int=0
val theBestHorse:Horse?=Horse("Andalouse")
lateinit var theBestRobot:Robot

fun main(array: Array<String>) {

    //someString=someStringOrNull

    someString= if (someStringOrNull != null) someStringOrNull else ""

    //someInt=someStringOrNull.length

    //someInt=someStringOrNull?.length

    someInt=someStringOrNull?.length?:0

    someString = someStringOrNull ?: ""

   // var someHorse:Horse=theBestRobot as? Horse?:Horse("Abaco Barb")
//    var robotX: Robot  =Robot("Robik")
//    theBestRobot=robotX
//    var someHorse:Horse=theBestRobot as Horse ?: Horse("Abaco Barb")
//    var someHorse:Horse=theBestRobot.
    var someHorse:Horse
    someHorse=theBestHorse!!

    someString=theBestHorse!!.breed

    println(theBestHorse?.let { getLengthOfString(it.breed) })

    theBestRobot= Robot("R-2")

    println(theBestRobot.type.addPrefix("type","="))

    println(someStringOrNullMutable.addPrefix("string","="))

    castToRobotIfPossible(null)
}


fun getLengthOfString(someString: String): Int {
return someString.length
}

                                    //private fun String.addPrefix(s: String, s1: String): Any? {}
fun String?.addPrefix(somePrefix: String, delimiter:String?):String{
    return "$somePrefix${delimiter?: " "}${this?: "string is null"}"
}

fun <T> castToRobotIfPossible(someObject:T) {
    someObject as Robot
}

class Horse (val breed:String)

class Robot(val type:String)*/
