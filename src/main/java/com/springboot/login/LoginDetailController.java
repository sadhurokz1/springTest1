package com.springboot.login;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginDetailController {

    @GetMapping(value = "login-detail-with-path-variable/{username}/{password}")
    public ResponseEntity<String> loginDetailWithPathVariable(@PathVariable("username") String username,
                                                      @PathVariable("password") String password){
        System.out.println("username" + username);
        System.out.println("password"+ password);
        return ResponseEntity.ok( username + password);
    }

    @PostMapping(value="login-detail-with-http-body")
    public ResponseEntity<String> loginDetailWithHttpBody(@RequestBody LoginDetailModel login){
        System.out.println("username"+login.getUsername());
        System.out.println("password"+login.getPassword());
        return ResponseEntity.ok("hello");
    }

    @GetMapping(value="login-detail-with-query-parameter")
    public ResponseEntity<String> loginDetailWithQueryParameter(@RequestParam("username") String username,
                                        @RequestParam("password") String password){
        System.out.println("id"+username);
        System.out.println("id2"+password);
        return ResponseEntity.ok(username + password);

    }
}
C:\Users\kapilyadav1204\IdeaProjects\SpringBootSample\src