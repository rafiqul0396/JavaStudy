package com.company.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparable<User>{

    public final Long id;
    public final String username;
    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }
    @Override
    public String toString() {
        return String.format("%s:%d", username, id);
    }

    @Override
    public int compareTo(User o) {
        return id.compareTo(o.id);
    }


    public static void main(String[] args) {
        /*List<String> Lists =new ArrayList<>();
        Lists.add(33, "A");
        Lists.add(35, "B");
        Lists.add(36, "C");
        Lists.add(36, "D");
        Lists.add(37, "E");
        Collections.sort(Lists);
        System.out.print(Lists);



        //List<User> users;
        List<User> users = Lists.newArrayList(
                new User(33L, "A"),
                new User(25L, "B"),
                new User(28L, ""));
        Collections.sort(users);
        System.out.print(users);
        Collections.sort(users, new Comparator<User>() {
            @Override
            /* Order two 'User' objects based on their names. */




    }
}
