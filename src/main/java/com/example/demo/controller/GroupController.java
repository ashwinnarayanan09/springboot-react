package com.example.demo.controller;

import com.example.demo.model.Group;
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
public class GroupController {

    @RequestMapping(value = "/api/groups", method = {RequestMethod.GET}, produces = "application/json")
    public ResponseEntity<List<Group>> getGroups(HttpServletResponse httpServletResponse) throws IOException {

        Group g1 = new Group(1,"Finance General");
        Group g2 = new Group(2,"Finance ERP");

        List<Group> groups = new ArrayList<>();
        groups.add(g1);
        groups.add(g2);

        return ResponseEntity.ok(groups);

    }
}
