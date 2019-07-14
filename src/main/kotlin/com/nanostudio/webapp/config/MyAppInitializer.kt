package com.nanostudio.webapp.config

import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet
import javax.servlet.ServletContext

class MyAppInitializer: WebApplicationInitializer {
    override fun onStartup(servletContext: ServletContext) {
        val myApplicationContext = AnnotationConfigWebApplicationContext()
            .apply { register(MyConfiguration::class.java) }

        val myDispatcherServlet = DispatcherServlet(myApplicationContext)

        servletContext.addServlet("myDispatcherServlet", myDispatcherServlet)
            .also {
                it.addMapping("/")
            }
        servletContext.addListener(MyListener::class.java)
    }
}