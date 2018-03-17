package com.example.asus.loginsignup;

/**
 * Created by ASUS on 03/02/2018.
 */

public class User
{
    private int id;
    protected String name;
    protected String username;
    protected String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public User(String name, String username, String paasword, int id) {
        this.name = name;
        this.username = username;
        this.password = paasword;
        this.id = id;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String paasword) {
        this.password = paasword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", paasword='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}
