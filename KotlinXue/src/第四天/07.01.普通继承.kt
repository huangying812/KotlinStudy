package 第四天普通继承

fun main(args: Array<String>) {

    val father = Father()
    father.sayHello()
    println(father.name)
    println(father.age)
    val son = Son()
    son.sayHello()
    println(son.name)
    println(son.age)
}

open class Father {
    var name: String = "黄"
    var age: Int = 30
    fun sayHello() {
        println("父类hello")
    }
}

class Son : Father() {

}