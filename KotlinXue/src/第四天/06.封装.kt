package 第四天

/**
 * 隐藏内部细节实现，只保留对外接口
 *不想让外面访问的，添加private修饰
 */
fun main(args: Array<String>) {
    val restaurant = Restaurant()
    restaurant.order()
//    restaurant.notifyCook()//私有的，无法访问
}

class Restaurant {

    /**
     * 点餐
     */
    fun order(){

    }

    /**
     * 打印小票
     */
    private fun getTicket(){

    }

    /**
     * 通知厨子
     */
    private fun notifyCook(){

    }

    /**
     * 炒菜
     */
    private fun cook(){

    }
}
