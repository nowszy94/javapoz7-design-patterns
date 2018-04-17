package com.sda.builder;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phoneNumber;

    public User() {
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String birthDate;
        private String phoneNumber;

        public User build() {
            User user = new User();
            user.setFirstName(this.firstName);
            user.setLastName(this.lastName);
            user.setBirthDate(this.birthDate);
            user.setPhoneNumber(this.phoneNumber);
            return user;
        }

        public UserBuilder firstName(String value) {
            this.firstName = value;
            return this;
        }
        public UserBuilder lastName(String value) {
            this.lastName = value;
            return this;
        }
        public UserBuilder birthDate(String value) {
            this.birthDate = value;
            return this;
        }
        public UserBuilder phoneNumber(String value) {
            this.phoneNumber = value;
            return this;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(birthDate, user.birthDate) &&
                Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, birthDate, phoneNumber);
    }
}
