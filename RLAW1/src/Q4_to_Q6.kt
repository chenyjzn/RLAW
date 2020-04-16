
open class Human(var name :String = "Fighter")
{
    open val mana:Boolean=false
    open fun attack()
    {
        println("$name use Fist Attack!")
    }
    fun manacheck()
    {
        if(!mana)
        {
            println("$name is Muggle")
        }
        else
        {
            println("$name is Magician")
        }
    }
}
class mage(anyname:String="Wizerd"):Human(anyname)
{
    override val mana:Boolean=true
    override fun attack()
    {
        println("$name use Fireball!")
    }
}
fun main()
{
    var person1 = Human()
    person1.manacheck()
    person1.attack()
    var person2 = mage()
    person2.manacheck()
    person2.attack()
}