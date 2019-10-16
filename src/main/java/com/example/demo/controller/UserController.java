package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {
    @RequestMapping(value = "/api/users", method = {RequestMethod.GET}, produces = "application/json")
    public ResponseEntity<List<User>> getUsers(HttpServletResponse httpServletResponse) throws IOException {

        User u1 = new User(1,"Ashwin");
        User u2 = new User(2,"Sebastian");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);

        return ResponseEntity.ok(users);

    }
}
