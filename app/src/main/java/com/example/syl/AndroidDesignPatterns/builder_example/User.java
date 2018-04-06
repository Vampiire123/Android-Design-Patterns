package com.example.syl.AndroidDesignPatterns.builder_example;

public class User {
    private String firstName;
    private int age;
    private String mobile;

    public User(String firstname, int age, String mobile){
        this.firstName = firstname;
        this.age = age;
        this.mobile = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public static class UserBuilder {
        private final String firstName;
        private int age;
        private String mobile;

        public UserBuilder(String firstName) {
            this.firstName = firstName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public User build() {
            return new User(firstName, age, mobile);
        }

    }
}