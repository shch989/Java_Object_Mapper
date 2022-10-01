package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    // 디폴트 생성자
    public User() {
        this.name = null;
        this.age = 0;
    }

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // 내가 임의로 만든 Mapper의 경우에는 get을 빼야한다
    public User DefaultUser() {
        return new User("default", 0, "010-1111-2222");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
