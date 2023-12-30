package com.example.first.rest.api;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ServiceLayer {

    //I need to call a method of repository layer
    RepositoryLayer obj =new RepositoryLayer();
    public String addUserToDB (User user){
        return obj.addUserToDB(user);
    }

    public User getFromDb(int userId){
        return obj.getFromDb(userId);
    }

    public String getYoungestPerson (){
        List<User> allusers=obj.getAllUsers();
        int min= Integer.MAX_VALUE;
        String youngestperson="";
        for(User users: allusers ){
            if(users.getage()<min){
                min= users.getage();
                youngestperson=new String (users.getname());
            }
        }
        return youngestperson;
    }


}
