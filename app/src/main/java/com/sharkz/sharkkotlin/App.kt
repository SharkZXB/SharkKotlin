package com.sharkz.sharkkotlin

import android.app.Application

/**
 * ================================================
 * 作    者：SharkZ
 * 邮    箱：229153959@qq.com
 * 创建日期：2020/11/28  20:54
 * 描    述
 * 修订历史：
 * ================================================
 */
class App:Application() {


    /**
     * 程序创建的时候
     */
    override fun onCreate() {
        super.onCreate()
    }

    /**
     * 内存不足的时候调用 兼容 API<14的
     */
    override fun onLowMemory() {
        super.onLowMemory()
    }

    /**
     * 内存不足的时候调用
     */
    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
    }

    /**
     * 在使用模拟器 推出程序的时候调用
     */
    override fun onTerminate() {
        super.onTerminate()
    }


}