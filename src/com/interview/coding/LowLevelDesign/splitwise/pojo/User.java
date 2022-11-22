package com.interview.coding.LowLevelDesign.splitwise.pojo;

public class User {

    String userId;
    String name;
    String mobileNumber;
    String emailId;
    Double balance;

    public User(String userId, String name, String mobileNumber, String emailId,Double balance) {
        this.userId = userId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.balance=balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", balance=" + balance +
                '}';
    }
}
