package lesson8

class Food (var basePrice: Double) : Product {
    override fun getFinalPrice(): Double {
        return (basePrice)
    }
}