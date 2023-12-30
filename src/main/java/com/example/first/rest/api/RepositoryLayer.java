package com.example.first.rest.api;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class RepositoryLayer {

    HashMap<Integer,User> userDB = new HashMap<>();
    public String addUserToDB (User user){
        userDB.put(user.userId,user);
        return "User has been added to DB";
    }

    public User getFromDb(int userId){
        return userDB.get(userId);
    }

    public List<User> getAllUsers(){
        List <User> allusers=new ArrayList<>();
        for(User users: userDB.values() ){
            allusers.add(users);
        }
        return allusers;
    }

}
