package com.sparta.create_Json_example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserDetailsTest {

    UserDetails bob = new UserDetails("Bob",21,"Lordbobius@thebobman.com");

    @Test
    public void checkObjectNotEmpty()
    {
        assertNotNull(bob);
    }

    @Test
    public void checkObjectDetails()
    {

    }

    @Test
    public void checkObjectName()
    {
        assertEquals(bob.getUserDetails().get("name"),"Bob");
    }

    @Test
    public void checkObjectAge()
    {
        assertEquals(bob.getUserDetails().get("Age"),21);
    }
    @Test
    public void checkObjectEmail()
    {
        assertEquals(bob.getUserDetails().get("Email"),"Lordbobius@thebobman.com");
    }

}
