package com.java.Day6;

import java.util.Objects;

public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;
        User u1 = new User(100,"小张","1qa2ww3ede");
        User u2 = new User(101,"小利","1qa2ww3ede");
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        String str1 = new String("medin");
        String str2 = new String("medin");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
class User {
    int id;
    String name;
    String pwd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                name.equals(user.name) &&
                pwd.equals(user.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }

    public User(int id, String name, String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

}
