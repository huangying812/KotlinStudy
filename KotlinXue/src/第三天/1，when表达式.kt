package 第三天

fun main(args: Array<String>) {

    var age = readLine()?.toInt()
    val process = advWhen(age)
//    println(process)
}

fun advWhen(ele : Int?){

    when(ele){
        10->println("它10岁")
        is Int->println("传递的是年龄")
        in 1..10->println("在10岁以内")
        !in 1..10 ->println("不在10岁以内")
        else -> println("所有情况都不满足")
    }
}

fun baseWhen(age: Int?): String {

    when(age){
        7->return "开始读小学"
        12->{
            println("开始读中学")
            return "开始读小学"
        }
        else -> return "读社会大学"
    }
}
