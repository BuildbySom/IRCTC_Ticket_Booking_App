package org.example.services;

import org.example.entities.User;

public class UserBookingService {
    private User user;
    //path of DataBase:
    private static final String USERS_PATH = "../localDB/users.json";

    public UserBookingService(User user){
        this.user =user;
    }
}
