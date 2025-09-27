package game

class Outlaw: Skills {
    override var health = 100
    override val armor = 20
    override val weapon = 30
    override val attackPower = 20
    override var armorDefense = 20
    override var armorDurability = 4
    override fun takeDamage(damage: Int) {
        health = maxOf(0, health - damage)
    }

}