package 第四天主构函数次构函数以及init函数调用顺序

/**
 * 主构函数最早执行
 * init方法在主构函数之后
 * 调用次构方法创建对象，那么次构方法的逻辑执行在init方法之后
 */
fun main(args: Array<String>) {
    //调用主构
    val person = Person("12sd",123,123124)
}

class Person(name:String,age:Int){
    init {
        println("调用了init方法")
    }
    constructor(name: String,age: Int,phone:Int):this(name, age){
        println("调用了次构函数")
    }
}