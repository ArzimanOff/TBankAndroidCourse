package kotlinclasshomework.kotlinClass

open class Employee {

    fun work() {
        println("Усердно работаю")
    }

    open fun haveLunch() {
        println("Иду на обед в 13.00")
    }

    open fun goHome() {
        println("Иду домой в 19.00")
    }
}


class Programmer() : Employee() {
    override fun haveLunch() {
        super.haveLunch()
        println("А потом еще и за кофеечком")
    }
}


class Designer : Employee() {

    override fun haveLunch() {
        println("Иду на обед в 15.00")
    }
}


class Teamlead : Employee() {

    override fun haveLunch() {
        println("Сегодня пропущу обед")
    }
}

class AndroidDeveloper: Employee(){
    override fun goHome() {
        println("Топаю домой")
    }

    override fun haveLunch() {
        super.haveLunch()
        println("А потом иду делать КастомВью")
    }
}

// TODO здесь можно создать новый класс, который будет наследоваться от класса Employee. Не забудьте переопределить методы haveLunch() и goHome()