package com.sparta.create_Json_example;


import org.json.simple.JSONObject;


public class App 
{
    public static void main( String[] args )
    {
//        JSONObject userDetails = new JSONObject();
//        userDetails.put("Name","Bob");
//        userDetails.put("Age",21);
//        userDetails.put("Email","Lordbobius@thebobman.com");
//        System.out.println(userDetails);
        UserDetails bob = new UserDetails("Bob",21,"Lordbobius@thebobman.com");
        System.out.println(bob.getUserDetails());


    }
}
