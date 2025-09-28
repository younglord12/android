package game

class Archer: Skills {
    override var health = 70
    override val armor = 30
    override val weapon = 20
    override val attackPower = 30
    override var armorDefense = 10
    override var armorDurability = 3
    override fun takeDamage(damage: Int) {
        health = maxOf(0, health - damage)
    }
}