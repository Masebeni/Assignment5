package masebeni.question4.Violated.domain;

import masebeni.question4.Violated.services.Databases;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class LoginPage {
    private String username = "admin";
    private String password = "admin";

    public String getUsername()
    {
        return  username;
    }

    public String getPassword()
    {
        return password;
    }

    public String isValidUser()
    {
        String msg;

        Databases database = new Databases();

        if(database.isValid())
            msg = "Welcome";
        else
            msg = "Invalid user!";
        return msg;
    }


}

