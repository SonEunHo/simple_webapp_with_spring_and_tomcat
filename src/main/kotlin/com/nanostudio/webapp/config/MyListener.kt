package com.nanostudio.webapp.config

import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener

class MyListener: ServletContextListener {
    override fun contextInitialized(sce: ServletContextEvent) {
        println("contextInitialized -------------------------")
    }
}