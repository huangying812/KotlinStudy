package 第四天对象的init关键字

fun main(args: Array<String>) {
    //定义一个有号码和邮箱的人
    val person = Person("asd", 18)
}

//通过构造方法传递name和age
class Person(name: String, age: Int) {
    //需求：创建对象时，需要打印hello
    init {
        println("hello")
    }
}