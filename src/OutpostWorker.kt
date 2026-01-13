class OutpostWorker (val name: String)
{
    var MaxEnergy: Int = 100
        private set
    var energy:Int = MaxEnergy
        set(value) {
            field = value.coerceIn(0, MaxEnergy)
        }
    var mood: Int = 50
        get() = field + (energy / 10)
    var level: Int = 1
        private set
    fun work() {
        println("$name выполняет работу...")
        energy -= 15
        if (energy < 20) println("$name устал!")}
    fun rest() {
            println("$name отдыхает...")
            energy += 20
    }
    fun levelUp() {
        level++
        MaxEnergy += 20
        energy = MaxEnergy
        println("$name повышает уровень: $level")
    }
}
fun main() {
    val worker=OutpostWorker ( "Алексей")
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.work()
    worker.work()
    worker.work()
    worker.work()
    worker.work()
    worker.work()
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.rest()
    worker.rest()
    worker.rest()
    worker.rest()
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.levelUp()
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
}
