package com.lguplus.fleta.ports.test;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "TestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class TestController {
    @RequestMapping(method = RequestMethod.GET, value = "/test/hello")
    public String sayHello() {

        return "Swagger Hello World";
    }

}
