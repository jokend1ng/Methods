package org.example;

import java.io.Serializable;

public class User extends Person implements Serializable {

    int age;
    private transient Address  address;
    public User(String name, String lastName, int age,Address address) {
        super(name, lastName);
        System.out.println("Constructor");
        this.age = age;
        this.address = address;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", address=" + address +
                '}';
    }
}
