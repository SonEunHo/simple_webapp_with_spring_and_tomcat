package com.nanostudio.webapp.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@ComponentScan("com.nanostudio.webapp")
@EnableWebMvc
open class MyConfiguration: WebMvcConfigurer {

}