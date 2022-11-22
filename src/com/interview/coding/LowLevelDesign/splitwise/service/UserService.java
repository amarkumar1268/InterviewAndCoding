package com.interview.coding.LowLevelDesign.splitwise.service;

import com.interview.coding.LowLevelDesign.splitwise.pojo.User;

public interface UserService {

    void addUser(User user);
    void delUser(User user);
    void printUser();
}
