package cls;

import exceptions.LengthException;
import exceptions.NotEqualException;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password, String passwordCheck) throws LengthException, NotEqualException {
        setUserName(userName);
        setPassword(password, passwordCheck);
    }

    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) throws LengthException {
        if(!checkUserNameLength(userName))
            throw new LengthException("User name must be between 5 and 15 characters");
        this.userName = userName;

    }

    private void setPassword(String password, String passwordCheck) throws LengthException, NotEqualException {

        if(!checkPasswordLength(password))
            throw new LengthException("Password must be longer than 3 characters");

        if(!password.equals(passwordCheck))
            throw new NotEqualException("Yours password are not equal");

        this.password = password;
    }

    private boolean checkUserNameLength(String username) {
        return (username.length() >= 5 && username.length() <= 15);
    }

    private boolean checkPasswordLength(String password) {
        return (password.length() >= 3);
    }
}
