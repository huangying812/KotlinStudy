package 第四天

fun main(args: Array<String>) {

}

abstract class Human(var name: String, var age: Int) {
    //吃饭 人类不知道怎么实现只能奥术大师多
    abstract fun eat()//抽象方法，具体实现交由子类，太太太基础啦，你妹的！！！！
}