package com.organization.example.controller

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
 * Created by Cory Klein on 2015-08-24.
 */

@RestController
class HelloWorldResource {

    @RequestMapping(value=Array("hi"))
    def helloWorld = {
        "hello world"
    }
}
