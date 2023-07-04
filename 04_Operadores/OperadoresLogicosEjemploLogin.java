
import java.util.Scanner;

public class OperadoresLogicosEjemploLogin {
    public static void main(String[] args) {
        String[] usernames = {"ramona", "admin", "pepito"};
        String[] passwords = {"678910", "012345", "pepinillo"};

        Scanner scanner = new Scanner(System.in);
        String username, password;

        System.out.print("username: ");
        username = scanner.next();

        System.out.print("password: ");
        password = scanner.next();

        boolean isLogged = false;

        for(int i = 0; i < usernames.length; i++) {
            //isLogged = (username.equals(usernames[i]) && password.equals(passwords[i]))?true:isLogged;
            if(username.equals(usernames[i]) && password.equals(passwords[i])) {
                isLogged = true;
                break;
            }
        }

        System.out.println((isLogged)?"\n ¡Bienvenid@ ".concat(username).concat("!")
                                      :"\n Invalid username or password");

        scanner.close();
    }
}
