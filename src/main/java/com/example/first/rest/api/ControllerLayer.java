package com.example.first.rest.api;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
class ControllerLayer {
    @PostMapping("/addToDb")
    public String addToDB(@RequestBody User user) {
        ServiceLayer obj =new ServiceLayer();
        return obj.addUserToDB(user);
    }

    @GetMapping ("/getFromDB")
    public User getFromDb(@RequestParam ("userId") int userId) {
        ServiceLayer obj =new ServiceLayer();
        return obj.getFromDb(userId);
    }
}
