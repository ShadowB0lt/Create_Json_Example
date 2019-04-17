package com.sparta.create_Json_example;

import org.json.simple.JSONObject;

public class UserDetails {

    private JSONObject userDetails = new JSONObject();
    private String name ;
    private int age;
    private String email;

    public UserDetails(String name, int age, String email) {

        this.name = name;
        this.age = age;
        this.email = email;

        userDetails.put("name",name);
        userDetails.put("Age",age);
        userDetails.put("email",email);
    }

    public JSONObject getUserDetails() {
        return userDetails;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
