
open class Person(protected var name: String = "", protected var age: Int = 0){

    var height: Int = 0
        set(value) {
            if (value < 0){
                println("Некорректные данные")
            }
            else if(value > 200){
                println("Дылда!!!")
            }
            else{
                field = value
            }
        }
        get(){
            return field
        }

    init {
        println("person $name was created")
    }

    protected fun showExtraInfo(company: String){
        println("$name $age $company")
    }

    open fun show(){
        println("$name $age")
    }
}

class Employee(name: String, age: Int, private var company: String = "") : Person(name, age){

    fun showEmployeeInfo(){
        showExtraInfo(company)
    }

    override fun show(){
        println("Employee: $name $age $company")
    }
}

fun main(){
    var person1 = Person()
    person1.show()
//    person1.height = 180
//    println(person1.height)
////    person1.show()
//    var person2 = Person("Ivan")
////    person2.show()
//    var person3 = Person(age = 5)
////    person3.show()
//    var person4 = Person("Ivan", 16)
//    person4.show()
    var employee1 = Employee("Vasya", 15, "Apple")
    employee1.show()
}