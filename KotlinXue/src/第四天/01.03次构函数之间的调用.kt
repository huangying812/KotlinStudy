package 第四天次构函数之间的调用

/**
* 次构函数必须调用主构函数
 * 次构函数可以相互调用
* */
fun main(args: Array<String>) {
    //定义一个有号码和邮箱的人
    val person = Person("asd",18,"54321","18216@asd.com")
}

//通过构造方法传递name和age
class Person(name: String, age: Int) {
    //主构函数
    //定义次构函数
    constructor(name: String, age: Int, phone: String) : this(name, age)//调用主构函数

    constructor(name: String, age: Int, phone: String, email: String) : this(name, age, phone)//调用上面的次构函数
}