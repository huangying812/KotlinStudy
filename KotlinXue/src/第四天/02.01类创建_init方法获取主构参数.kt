package 第四天类创建_init方法获取主构参数

fun main(args: Array<String>) {
    //定义一个有号码和邮箱的人
    val person = Person("asd", 18)
    println(person.toString())
}

//通过构造方法传递name和age
class Person(name: String, age: Int) {
    var name = ""
    var age = 10
    init {
        this.name = name
        this.age = age
    }
    override fun toString(): String {
        return "Person(name=$name age=$age)"
    }
}