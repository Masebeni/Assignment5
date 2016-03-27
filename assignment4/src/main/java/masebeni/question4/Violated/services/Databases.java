package masebeni.question4.Violated.services;

import masebeni.question4.Violated.domain.LoginPage;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Databases {


    private ArrayList<String> username = new ArrayList<String>(Arrays.asList("admin", "user"));
    private ArrayList<String>password = new ArrayList<String>(Arrays.asList("admin", "user"));

    private boolean isValid = false;

    public boolean isValid()
    {
        LoginPage login = new LoginPage();
        return this.username.contains(login.getUsername()) & this.password.contains(login.getPassword());
    }
}
