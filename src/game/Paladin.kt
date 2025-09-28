package game

class Paladin : Skills {
    override var health = 150
    override val armor = 10
    override val weapon = 50
    override val attackPower = 10
    override var armorDefense = 30
    override var armorDurability = 5
    override fun takeDamage(damage: Int) {
        health = maxOf(0, health - damage)
    }

}