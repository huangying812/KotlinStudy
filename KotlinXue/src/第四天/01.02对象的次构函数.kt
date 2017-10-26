package 第四天次构函数

fun main(args: Array<String>) {

    val person1 = Person("张三",5)
    val person2 = Person("李四",30,"4545212")
    println(person1)
}
//通过构造方法传递name和age
class Person(name:String,age:Int){//主构函数
    //定义次构函数
    constructor(name: String,age: Int,phone:String):this(name,age)
}
