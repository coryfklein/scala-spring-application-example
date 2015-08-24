package com.organization.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{ComponentScan, Configuration}

@Configuration
@EnableAutoConfiguration
@ComponentScan
class SpringApplicationExample {
}

object SpringApplicationExample extends App {
    val app = new SpringApplication(classOf[SpringApplicationExample])
    val ctx = app.run(args: _*)
}
