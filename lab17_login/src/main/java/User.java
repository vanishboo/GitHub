import javax.management.relation.Role;
import java.security.PublicKey;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    String login;
    String password;
    Role1 role;

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public Role1 getRole1() {
        return role;
    }

    public User(String login, String password, Role1 role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
    public static Role1 userCheck(String login, String password, User[] users) throws WrongLoginException, WrongPasswordException {
        Pattern patternLogin = Pattern.compile("[a-zA-Z0-9@\\[\\]._-]{20,}");
        Pattern patternPassword = Pattern.compile("[a-zA-Z0-9@\\[\\]{}(),.;&?!_\\-+]{8,}");

        Matcher matcherPassword = patternPassword.matcher(password);
        Matcher matcherLogin = patternLogin.matcher(login);


        if (!matcherLogin.find()) {
            throw new WrongLoginException("Неккоректный логин, введите еще раз");
        }
        if (!matcherPassword.find()) {
            throw new WrongPasswordException("Неккоректный пароль, введите еще раз");
        }
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getLogin()) && password.equals(users[i].getPassword())) {
                return users[i].getRole1();
            }
        }
        return null;
    }

}



