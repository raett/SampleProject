package lesson4.loginApp;

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
        List<User> userList = (List<User>) mapUser.values();
        return userList;

    }
}

