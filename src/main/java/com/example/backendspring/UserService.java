package com.example.backendspring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    public UserService() {
        ObjectMapper objectMapper = new ObjectMapper();
    }

    public UsersPage getUsers(int pageNumber, int pageSize, Map<Integer, UserEntity> users)
    {
        pageNumber=Math.max(1,pageNumber);
        pageSize=Math.max(1,pageSize);
        pageSize=Math.min(100,pageSize);
        int totalCount = users.size();
        int pagesCount =(int)Math.ceil((double)totalCount/(double)pageSize);

        return new UsersPage(pageNumber, pagesCount, pageSize, totalCount, users);

    }

    public UserEntity createUser(Map<Integer, UserEntity> users, UserEntity user) {
        var id = users.size();
        users.put(id, user);
        var resp = users.get(id);
        resp.Id=id;
        return resp;
    }
}