package com.company;

//Creating user profile

public class User_Profile extends Quiz{
    private String username;
    private String password;


    //setters to set user values
    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    //getters to get user values
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

