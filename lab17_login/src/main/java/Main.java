import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("bazarnovroman@gmail.com", "12345678", Role1.USER),
                new User("bondarenkoivan@gmail.com", "87654321", Role1.ADMIN)
        };

        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            try {
                System.out.println("Введите логин (или 'exit' для выхода):");
                String login = sc.nextLine();
                if (login.equalsIgnoreCase("exit")) {
                    System.out.println("Выход из программы.");
                    break;
                }

                System.out.println("Введите пароль:");
                String password = sc.nextLine();

                Role1 role = User.userCheck(login, password, users);

                if (role == Role1.ADMIN) {
                    System.out.println("ADMIN: \n" +
                            "1. File\n" +
                            "2. Create new user\n" +
                            "3. exit\n");
                    flag = false;
                } else if (role == Role1.USER) {
                    System.out.println("USER:\n" +
                            "1. File\n" +
                            "2. Get play list\n" +
                            "3. exit");
                    flag = false;
                } else {
                    System.out.println("Пользователь не найден");
                }
            } catch (WrongLoginException e) {
                System.out.println("Неправильный логин");
            } catch (WrongPasswordException e) {
                System.out.println("Неправильный пароль");
            }
        }
    }
}
