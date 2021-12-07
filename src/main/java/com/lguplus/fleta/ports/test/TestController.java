package com.lguplus.fleta.ports.test;

import com.lguplus.fleta.config.dto.UserInfo;
import com.lguplus.fleta.ports.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@Api(value = "TestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/test/hello")
    public String sayHello() {
        UserInfo rs =  userService.findUser("admin");
        System.out.println("Result =============== " + rs.getUsername());
        String rsString  = "username = " + rs.getUsername() + " Password = " + rs.getPassword();
        return ResponseEntity.ok().toString();
    }

}
