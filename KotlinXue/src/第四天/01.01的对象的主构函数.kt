package 第四天主构函数

fun main(args: Array<String>) {

    val person = Person("李四",30)
    println(person)
}
//通过构造方法传递name和age
class Person(name:String,age:Int)

/*
class Person{
    var name  = "张三"
    var age = 30
    override fun toString(): String {
        return "Peson(name='$name', age=$age)"
    }
}*/
