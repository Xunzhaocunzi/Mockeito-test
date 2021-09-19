package com.Logger;

public class UserController {
    public void login(String username, String password){
        Logger.getInstance().log("login");
    }
}
