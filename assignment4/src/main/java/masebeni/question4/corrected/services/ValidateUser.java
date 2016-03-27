package masebeni.question4.corrected.services;

import masebeni.question4.corrected.domain.Login;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class ValidateUser {
    public static boolean isValid()
    {
        Login login = new Login();
        Users users = new Users();

        return users.verify(login.getUsername(), login.getPassword());
    }

}

