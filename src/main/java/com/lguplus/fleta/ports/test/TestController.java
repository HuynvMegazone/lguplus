package com.lguplus.fleta.ports.test;

import com.lguplus.fleta.config.dto.UserInfo;
import com.lguplus.fleta.ports.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "TestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/test/user")
    public String getUsername(@Param("username") String username) {
        UserInfo rs =  userService.findUsername(username);
        System.out.println("Result =============== " + rs.getUsername());
        return "Swagger Hello World";
    }

}
