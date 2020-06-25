package classes

class NewClass :MainProvider(){
    override val db: String
        get() = "DB not connected"
    override val info: String
        get() = "Новый метод из класса наследника"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Выводится текст из класса наследника")
    }
}