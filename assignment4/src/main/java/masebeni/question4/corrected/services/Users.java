package masebeni.question4.corrected.services;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Users {
    private ArrayList<String>username = new ArrayList<String>(Arrays.asList("X101", "axe"));
    private ArrayList<String>password = new ArrayList<String>(Arrays.asList("1q2w3e", "123"));

    public boolean verify(String username, String password)
    {
        return (this.username.contains(username) & this.password.contains(password));
    }

}
