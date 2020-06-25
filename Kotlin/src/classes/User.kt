package classes

class User (var firstName: String="Peter", var secondName:String="Patrik"){
    var login: String?=null
    set(value){
        if(value=="Codi")
            field="None"
        else
            field=value
        println("Значение переменной: $field")
    }
    get() {
        val loginField=field ?:"неизвестно"
              println("Переменная равна: $loginField")
        return field
    }

    fun printUser(){
      println("$firstName $secondName")
   }
//  var firstName: String=_ferstname
//  var secondName: String=_secondName

//    init {
//        firstName=_ferstname
//        secondName=_secondName
//    }
//
//
//    constructor():this("Peter", "Patrik"){
//    println("Данные были установлены!")}
//    constructor(firstName: String):this(firstName, "Patrik"){
//    println("Данные были установлены2!")}
}