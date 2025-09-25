package lesson8

class Clothing (var basePrice: Double) : Product {
    override fun getFinalPrice(): Double {
        return (basePrice * 0.85)
    }
}