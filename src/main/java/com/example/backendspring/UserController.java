package com.example.backendspring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    private Map<Integer, UserEntity> users = new HashMap<>();

    public UserController()
    {
        users.put(1,new UserEntity("John", 44));
    }
    @RequestMapping("/users")
    @ResponseBody
    public String users() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//        for (Map.Entry<Integer,UserEntity> user : users.entrySet())
//        {
//
//        }
        return objectMapper.writeValueAsString(users);


    }
}
