package lesson4.loginApp;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your login:");
        String log = sc.next();
        System.out.println("Enter your password:");
        String password = sc.next();
        User userFromService = userService.getByLogin(log);

        if(userFromService == null || !password.equals(userFromService.getPassword())) {
            System.exit(-1);
        }
        System.out.println("1.  add user\n2.  Delete user\n3.  print users");
        int userSwitch  =  sc.nextInt();
        switch (userSwitch){
            case 1: {
                
                break;
            }
            case 2: {

                break;
            }
            case 3: {

                break;
            }

        }

        System.out.println("correct password");



    }
}
