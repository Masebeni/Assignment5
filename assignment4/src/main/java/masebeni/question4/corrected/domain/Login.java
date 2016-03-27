package masebeni.question4.corrected.domain;

import masebeni.question4.corrected.services.ValidateUser;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Login {
    private String username = "X101";
    private String password = "1q2w3e";

    public String getUsername()
    {
        return  username;
    }

    public String getPassword()
    {
        return password;
    }

    public void verify()
    {
        if(ValidateUser.isValid())
            System.out.println("Login successful");
        else
            System.out.println("Invalid username or password");
    }

}
