package declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
//    val number: Short = 25
//    val number = 25
//    number = 1 error

    var number: Int
    number = 10
    number = 20

    val employee1 = Employee("Peter", 500)
    employee1.name = "Peter Package"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane", 400)
    } else {
        employee2 = Employee("John", 150)
    }

    println(employee1.name)
    println(employee2.name)

    val employees: EmployeeSet

}

class Employee(var name: String, var id: Int) {

}