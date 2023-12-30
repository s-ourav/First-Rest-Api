package com.example.first.rest.api;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController // This tells spring that this class is having APIs written
public class APIClass {

    HashMap<Integer,User> userDb=new HashMap<>();
    private int userID;
    private String name;
    private int age;

    @GetMapping("/getWeatherUpdate")
    public String getWeatherUpdate () {
        return "The weather is good";
    }

//    @GetMapping("/addUser")
//    public String addUser (@RequestParam("userID")int userID, @RequestParam ("name") String name, @RequestParam("age") int age){
//        User obj=new User(name,age,userID);
//        int dbkey=userID;
//        userDb.put(dbkey,obj);
//
//        return "User record added";
//    }

    @GetMapping("/getUserInfo")
    public User getUser ( @RequestParam("userID") int userID){
        User user= userDb.get(userID);
        return user;
    }



    @PostMapping ("/addUserViaBody")
    public String addUserViaReqbody (@RequestBody User userobj) {
        userDb.put(userobj.getuserId(),userobj);
        System.out.println(userDb.get(userobj.getuserId()));
        return "User added";
    }


    @GetMapping ("/getUser/{userId}")
    public User getUserViaPath (@PathVariable ("userId") int userId) {
        User user=userDb.get(userId);

        return user;
    }
}
