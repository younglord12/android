import java.util.concurrent.locks.ReentrantLock

//task1
class Counter(private val externalLock: ReentrantLock) {
    var count = 0
        private set

    fun increment() {
        externalLock.lock()
        try {
            count++
        } finally {
            externalLock.unlock()
        }
    }

    fun decrement() {
        externalLock.lock()
        try {
            count--
        } finally {
            externalLock.unlock()
        }
    }
}