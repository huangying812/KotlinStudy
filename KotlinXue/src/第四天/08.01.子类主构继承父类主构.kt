package 第四天子类主构继承父类主构

fun main(args: Array<String>) {

}

open class Human(var name: String, var age: Int)
//父类主构有参数，子类继承必须要传递给父类
class Man(var newName: String, var newAge: Int) : Human(newName, newAge) {

}

