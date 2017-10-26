package 第三天

fun main(args: Array<String>) {
    val person = Person2()
    person.name = "wang"
    println(person.name)
    println(person.age)
}

class Person1{
//    成员变量
    var name : String = "张三"

}
class Person2{
//    成员变量
    var name : String = "张三"
    get() {
        println("找到名字啦")
        return field
    }
    set(value) {
        field = value
    }
    val age = 30
}