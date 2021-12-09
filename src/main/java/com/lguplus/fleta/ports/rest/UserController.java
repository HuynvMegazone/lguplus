package com.lguplus.fleta.ports.rest;

import com.lguplus.fleta.config.dto.UserInfo;
import com.lguplus.fleta.ports.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "TestController")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/test/user")
    public ResponseEntity<String> getUsername(@Param("username") String username) {
        UserInfo rs = userService.findUsername(username);
        return new ResponseEntity<>(rs.getUsername(), HttpStatus.OK);
    }

}
