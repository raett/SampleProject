package lesson4.loginApp;

public class User {
    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}