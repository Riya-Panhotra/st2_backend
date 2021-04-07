package com.fullstackapp.Trail.service;


import com.fullstackapp.Trail.Model.User;
import com.fullstackapp.Trail.Repository.UserRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {

    @Autowired
    private UserRepostory userRepostory;


    public List<User> getalluser()
    {
         return userRepostory.getallusers();
    }


     public void createnewuser(User newuser)
     {
         userRepostory.adduser(newuser);
     }


}
