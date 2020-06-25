
var message: String= "Hello World"

val simpleNumber: Int =38

var numberOfCharsInString: Int =0

fun main(args: Array<String>){
    printToConsole(message)
    println()
    printToConsole(getFirstAndLastCharToString(message))
    println()
    printToConsole(getNumberOfChars(message).toString())
}

fun getNumberOfChars(message: String): Int=message.length

fun getFirstAndLastCharToString(message: String): String {
    return message.last().plus(message[0].toString())

}

fun printToConsole(message: String="nothing") {
    print(message)
}
