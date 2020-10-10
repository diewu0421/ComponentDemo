package com.example.homemodule.utils

import android.util.Log

/**
 * 浙江集商优选电子商务有限公司
 * @author zenglw
 * @date   20-10-10 下午5:45
 */
class Test  {
    companion object {
        fun test(str:String) {
            log(str)
        }

        private fun log(str: String) {
            Log.e("MyTest", str)
        }
    }
}