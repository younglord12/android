package lesson8

class Electronics (var basePrice: Double) : Product {
    override fun getFinalPrice(): Double {
        return (basePrice * 0.9)
    }

}