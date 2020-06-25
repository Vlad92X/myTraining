package classes

interface UserInfoProvider {
    val info:String
    fun printInfo(user: User){
        println(info)
        user.printUser()
    }
}
  interface DbConnection{
      fun getConnection():String
  }


open class MainProvider:UserInfoProvider, DbConnection{
    protected open val db="DB Connected"

    override val info: String
        get() = "Method was called!"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("дополнительный код")
    }

    override fun getConnection(): String {
        return db
    }

}