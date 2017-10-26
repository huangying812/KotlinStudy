package 第四天子类次构继承父类主构

fun main(args: Array<String>) {

}

open class Human(var name: String, var age: Int)
class Man : Human {

    constructor(name: String,age: Int):super(name, age)
}