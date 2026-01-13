interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop() {
        println("Останавливаемся...")
    }
}
class Car(
    override val model: String,
    override val number: String
): Movable {
    override var speed = 60
    override fun move() {
        println("Едем на машине со скоростью $speed км/ч")
    }

    class Aircraft(
        override val model: String,
        override val number: String
    ) : Movable {
        override var speed = 600
        override fun move() {
            println("Летим на самолёте со скоростью $speed км/ч")
        }

        override fun stop() = println("Приземляемся...")
    }

    fun main() {
        val pavel = WorkingStudent("Pavel")
        pavel.work()
        pavel.study()
        val car: Movable = Car()
        val aircraft: Movable = Aircraft()
        fun travel(obj: Movable) = obj.move()
        travel(car)
        travel(aircraft)
        aircraft.move()
        aircraft.stop()
    }

    interface Worker {
        fun work()
    }

    interface Student {
        fun study()
    }

    class WorkingStudent(val name: String) : Worker, Student {
        override fun work() = println("$name работает")
        override fun study() = println("$name учится")

    }
}

