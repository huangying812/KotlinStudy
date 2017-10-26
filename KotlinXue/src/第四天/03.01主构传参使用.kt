package 第四天主构传参使用

/**
 * 定义对象主构函数，可以通过添加var修饰
 * 可以直接使用字段
 * 可以修改字段
 * */
fun main(args: Array<String>) {
    //定义一个有号码和邮箱的人
    val person = Person("asd",10)
    println(person.toString())
    person.name = "1234"
    println(person.toString())
}

//通过构造方法传递name和age
class Person(var name: String,var age: Int) {
    override fun toString(): String {
        return "Person(name=$name age=$age)"
    }
}