package model.app_db;

import model.roles.Gymnastic;
import model.roles.User;

import java.util.*;

/**
 * AppDB
 */
public class AppDB {
    private static int userIdCounter = 1;
    private static int gymnasticIdCounter = 1;
    private Map<User, List<Gymnastic>> users;
    private Collection<Gymnastic> allGymnastics;


   /* public AppDB() {
    }*/

    public AppDB() {
        users = new HashMap<User, List<Gymnastic>>();
        allGymnastics = new ArrayList<Gymnastic>();
    }

    public AppDB(Map<User, List<Gymnastic>> users, Collection<Gymnastic> allGymnastics) {
        this.users = users;
        this.allGymnastics = allGymnastics;
    }

    public Map<User, List<Gymnastic>> getUsers() {
        return users;
    }

    public void setUsers(Map<User, List<Gymnastic>> users) {
        this.users = users;
    }

    public Collection<Gymnastic> getAllGymnastics() {
        return allGymnastics;
    }

    public void setAllGymnastics(Collection<Gymnastic> allGymnastics) {
        this.allGymnastics = allGymnastics;
    }


    @Override
    public String toString() {
        return "AppDB{" +
                "users=" + users +
                ", allGymnastics=" + allGymnastics +
                '}';
    }




}

