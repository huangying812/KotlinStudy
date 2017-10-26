package 第三天

fun main(args: Array<String>) {
    var person = Person3()
//    person.name = "李四"
    println(person.name)
}

class Person3 {

    //只能访问字段，不能修改
    var name = "张三"
    private set
    val age = 30
}
