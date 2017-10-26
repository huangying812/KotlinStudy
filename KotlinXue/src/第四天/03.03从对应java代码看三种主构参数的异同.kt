package 第四天从对应java代码看三种主构参数的异同

/**
 * */
fun main(args: Array<String>) {
    val person = Person1("asd", 10)
    println(person.toString())
//    person.name = "1234" //报错
    println(person.toString())
}

class Person1(name: String,age: Int) {
}
class Person2(var name: String,var age: Int) {
}
class Person3(val name: String,val age: Int) {
}