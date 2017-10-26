package 第四天继承_方法重写和属性重写

/**
 * 1.复写父类属性字段和方法，父类对应的属性字段/方法必须是open修饰的
 */
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
    open var name: String = "莹"
    open var age: Int = 30
    open fun sayHello() {
        println("父类hello")
    }
}

class Son : Father() {

    override var name = "和";
    override var age = 1;
    override fun sayHello(){
        "孩子hello"
    }
}