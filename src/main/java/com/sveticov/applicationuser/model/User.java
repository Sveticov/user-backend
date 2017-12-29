package com.sveticov.applicationuser.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class User {
    @Id
    private @Getter
    @Setter
    long id;
    private @Getter
    @Setter
    String firstNane;
    private @Getter
    @Setter
    String lastName;
    private @Getter
    @Setter
    int age;
    private @Getter
    @Setter
    String sex;
    private @Getter
    @Setter
    String mail;


    public User() {
    }

    public User(String firstNane, String lastName, int age, String sex, String mail) {
        this.firstNane = firstNane;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstNane='" + firstNane + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
