package lesson4.loginApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private Map<String,User> mapUser;

    public UserService() {
        this.mapUser =  new HashMap<String, User>();
        User admin = new User("qwertyuiop","1234567890",99);
        mapUser.put(admin.getLogin(), admin);
    }

    public User getByLogin (String login) {
        return mapUser.get(login);
    }

    public boolean addUser(User user){
       if (!mapUser.containsKey(user.getLogin())){
           mapUser.put(user.getLogin(),user);
           return true;
       } else {
           return false;
       }
    }

    public boolean deleteUser(User user){
        if (mapUser.containsKey(user.getLogin())){
            mapUser.remove(user.getLogin());
            return true;
        } else {
            return false;
        }
    }

    public List<User> getAll (){
        List<User> userList = new ArrayList<User>(mapUser.values());
        return userList;

    }

    public boolean editUsersAll (String loginEdit, String newUserLogin, String newUserPassword, int newUserAge){
        if (mapUser.containsKey(loginEdit)){
            mapUser.remove(loginEdit);
            User editUser= new User(newUserLogin,newUserPassword,newUserAge);
            mapUser.put(newUserLogin,editUser);
            System.out.println("Editing user complit");
            return true;
        } else {
            System.out.println("unknow user");
            return false;
        }
    }

    public boolean editUserByLogin (String editLogin,String newUserLogin){
        if (mapUser.containsKey(editLogin)){
            String passwordEdit = mapUser.get(editLogin).getPassword();
            int ageEdit = mapUser.get(editLogin).getAge();
            mapUser.remove(editLogin);
            User editUser = new User(newUserLogin,passwordEdit,ageEdit);
            mapUser.put(newUserLogin,editUser);
            System.out.println("edit user complit");
            return true;
        } else {
            System.out.println("unknow user");
            return  false;
        }
    }

    public boolean editUserByPassword (String editLogin,String newUserLogin){
        if (mapUser.containsKey(editLogin)){
            String passwordEdit = mapUser.get(editLogin).getPassword();
            int ageEdit = mapUser.get(editLogin).getAge();
            mapUser.remove(editLogin);
            User editUser = new User(newUserLogin,passwordEdit,ageEdit);
            mapUser.put(newUserLogin,editUser);
            System.out.println("edit user complit");
            return true;
        } else {
            System.out.println("unknow user");
            return  false;
        }
    }

    public boolean editUserByAge (String editLogin,int newUserAge){
        if (mapUser.containsKey(editLogin)){
            String UserLogin = mapUser.get(editLogin).getLogin();
            String UserPassword = mapUser.get(editLogin).getPassword();
            mapUser.remove(editLogin);
            User editUser = new User(UserLogin, UserPassword ,newUserAge);
            mapUser.put(UserLogin,editUser);
            System.out.println("edit user complit");
            return true;
        } else {
            System.out.println("unknow user");
            return  false;
        }
    }

}

