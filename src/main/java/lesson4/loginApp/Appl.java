package lesson4.loginApp;

import sun.awt.util.IdentityLinkedList;

import java.util.Map;
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

        if (userFromService == null || !password.equals(userFromService.getPassword())) {
            System.exit(-1);
        }

        while (true) {
            System.out.println("1.  Add user\n2.  Delete user\n3.  Print users\n4.  Edit User");
            int userSwitch = sc.nextInt();
            switch (userSwitch) {
                case 1: {
                    System.out.println("Please enter login:");
                    String newUserLogin = sc.next();
                    System.out.println("Please enter password:");
                    String newUserPassword = sc.next();
                    System.out.println("Please enter age:");
                    int newUserAge = sc.nextInt();
                    User newUser = new User(newUserLogin, newUserPassword, newUserAge);
                    if (userService.addUser(newUser)) {
                        System.out.println("create new user complete");
                    } else {
                        System.out.println("a user with that username already exists");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter login user");
                    String deleteUser = sc.next();
                    if (userService.deleteUser(userService.getByLogin(deleteUser))) {
                        System.out.println("delete user complete");
                    } else {
                        System.out.println("no user with this username was found");
                    }
                    break;
                }
                case 3: {
//                    Iterator<Map.Entry<String, String>> iterator = userService.getByLogin();
//                    while (iterator.hasNext()) {
//                        Map.Entry<String, String> pair = iterator.next();
//                        String key = pair.getKey();
//                        String value = pair.getValue();
//                        System.out.println(key + ":" + value);
//                    }
                    for (User p : userService.getAll()) {
                        System.out.println(p.toString());
                    }

                    break;
                }
                case 4 :{
                    System.out.println("Enter what you edit :\n 1.  Login\n 2.  Password\n 3.  Age\n 4.  All");
                    int editSwitch =sc.nextInt();
                    System.out.println("Enter login edit user");
                    String editUserlogin = sc.next();
                    switch (editSwitch){
                        case 1: {
                            System.out.println("Enter new user login");
                            String newUserLogin = sc.next();
                            userService.editUserByLogin(editUserlogin,newUserLogin);
                            break;
                        }
                        case 2: {
                            System.out.println("Enter new user password");
                            String newUserPassword = sc.next();
                            userService.editUserByPassword(editUserlogin,newUserPassword);
                            break;
                        }
                        case 3: {
                            System.out.println("Enter new user age");
                            int newUserAge = sc.nextInt();
                            userService.editUserByAge(editUserlogin,newUserAge);
                            break;
                        }
                        case 4: {
                            System.out.println("enter new user login");
                            String newUserLogin = sc.next();
                            System.out.println("Enter new user password");
                            String newUserPassword = sc.next();
                            System.out.println("Enter new user age");
                            int newUserAge = sc.nextInt();
                            userService.editUsersAll(editUserlogin,newUserLogin,newUserPassword,newUserAge);
                            break;
                        }

                    }



                }
            }
        }
    }
}


