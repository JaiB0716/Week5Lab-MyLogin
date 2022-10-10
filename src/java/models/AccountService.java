
package models;

/**
 *
 * @author Owner
 */
public class AccountService {
    private String username1;
    private String username2;
    private String password;

    public AccountService() {
        username1 = "abe"; 
        username2 = "barb";
        password = "password";
    }

    public AccountService(String username1, String username2, String password) {
        this.username1 = username1;
        this.username2 = username2;
        this.password = password;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}


