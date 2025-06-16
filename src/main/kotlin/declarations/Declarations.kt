package declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    learnStringManipulation()
}

fun learnStringManipulation() {
    val employeeOne = Employee("Pedro", 1)

    println(employeeOne) //"Employee(id=$id, name=$name)"

    val change = 4.22
    println(" to show the value of change, we use \$change is $$change")

    val numerator = 10.99
    val denominator = 20.00

    println("the valor of $numerator divided by $denominator is ${numerator/denominator}")

    println("the employee's id is ${employeeOne.id}")
}

fun learCast() {
    val employeeOne = Employee("Pedro", 1)
    val something: Any = employeeOne

    if (something is Employee) { // compiler as cast -> smart cast
//        val newEmployee = something as Employee // as ->cast
        println(something.name)
    }
}

fun learnOperators() {
    /* Operators */
    val x = 0x00101011
    val y = 0x00101101

    x or y
    x and y
    //is
    //xor
}

fun learnEquality() {
    /* Equality */
//    val employeeOne = Employee("Pedro", 1)
//    val employeeTwo = Employee("Mary", 2)
//    val employeeThree = Employee("Mary", 2)
//
//    println(employeeOne == employeeTwo)
//    println(employeeTwo == employeeThree)
//    println(employeeOne.equals(employeeTwo))
//    println(employeeTwo.equals(employeeThree))
//    println("-------------------------------------")
//
//    /* check references */
//    println(employeeOne === employeeTwo)
//    println(employeeTwo === employeeThree) // false as java
//
//    val employeeFour = employeeTwo
//    println(employeeFour === employeeTwo)
//    println(employeeFour != employeeTwo)
//    println(employeeTwo != employeeThree)

    /*
    * Java:
    *     false
    *     false
    *     false
    *     true
    *
    */
}

fun learnBasicDeclarations() {
//    val number: Short = 25
//    val number = 25
//    number = 1 // error

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
    override fun toString(): String {
        return "Employee(id=$id, name=$name)"
    }
}