package 第四天次构函数传递的变量使用

/**
 * 次构函数，需要自己定义成员变量来保存额外的传参
 * */
fun main(args: Array<String>) {
    val person = Person("asd", 10)
    println(person.toString())
    println(person.toString())
}

class Person(var name: String,var age: Int) {
    var phone = ""
    constructor(name: String, age: Int, phone: String) : this(name, age){
        this.phone = phone
    }
}