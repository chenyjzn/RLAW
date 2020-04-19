
open class Human(var name :String = "Fighter")
{
    open val hasMana:Boolean=false
    open fun attack()
    {
        println("$name use Fist Attack!")
    }
    fun manaCheck()
    {
        if(hasMana)
        {
            println("$name is Magician")
        }
        else
        {
            println("$name is Muggle")
        }
    }
}
class Mage(anyName:String="Wizerd"):Human(anyName)
{
    override val hasMana:Boolean=true
    override fun attack()
    {
        println("$name use Fireball!")
    }
}
fun main()
{
    var person1 = Human()
    person1.manaCheck()
    person1.attack()
    var person2 = Mage()
    person2.manaCheck()
    person2.attack()
}