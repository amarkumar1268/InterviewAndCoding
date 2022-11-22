package com.interview.coding.LowLevelDesign.splitwise.service;

import com.interview.coding.LowLevelDesign.splitwise.constants.Constants;
import com.interview.coding.LowLevelDesign.splitwise.pojo.User;

import java.util.List;

public interface SplitWise {

    void addBalance(User user, Double expense, List<User> usertoSplitWith);
    void showBalane(User user);
    void splitExpenses();
}
