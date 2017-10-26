package 第四天主构传参使用val

/**
 * 定义对象主构函数，可以通过val
 * 可使用字段
 * 不可以修改字段
 * */
fun main(args: Array<String>) {
    //定义一个有号码和邮箱的人
    val person = Person("asd", 10)
    println(person.toString())
//    person.name = "1234" //报错
    println(person.toString())
}

//通过构造方法传递name和age
class Person(val name: String,val age: Int) {
    override fun toString(): String {
        return "Person(name=$name age=$age)"
    }
}