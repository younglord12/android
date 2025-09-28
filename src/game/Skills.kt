package game

interface Skills {
    var health: Int
    val armor: Int
    val weapon: Int
    val attackPower: Int
    var armorDefense: Int
    var armorDurability: Int

    fun takeDamage(damage: Int)

    fun attack(opponent: Skills) {
        val rawDamage = this.attackPower
        var blocked = minOf(opponent.armorDefense, rawDamage)

        if (opponent.armorDurability > 0) {
            opponent.armorDurability -= 1
        } else {
            blocked = 0
        }

        val actualDamage = maxOf(0, rawDamage - blocked)
        opponent.takeDamage(actualDamage)
    }


}