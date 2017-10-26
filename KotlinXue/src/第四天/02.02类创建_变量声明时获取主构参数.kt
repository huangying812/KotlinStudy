package 第四天类创建_变量声明时获取主构参数

fun main(args: Array<String>) {
    //定义一个有号码和邮箱的人
    val person = Person("asd",33)
    println(person.toString())
}

//通过构造方法传递name和age
class Person(name: String, age: Int) {
    var name = name
    var age = age
    override fun toString(): String {
        return "Person(name=$name age=$age)"
    }
}