package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "user1", 'M', LocalDate.of(1990,1,1), 20));
        userList.add(new ForumUser(2, "user2", 'F', LocalDate.of(1994,1,1), 42));
        userList.add(new ForumUser(3, "user3", 'M', LocalDate.of(1998,1,1), 12));
        userList.add(new ForumUser(4, "user4", 'F', LocalDate.of(2002,1,1), 15));
        userList.add(new ForumUser(5, "user5", 'F', LocalDate.of(2006,1,1), 0));
        userList.add(new ForumUser(6, "user6", 'M', LocalDate.of(2010,1,1), 1));
        userList.add(new ForumUser(7, "user7", 'M', LocalDate.of(2014,1,1), 2));
        userList.add(new ForumUser(8, "user8", 'F', LocalDate.of(2018,1,1), 5));
        userList.add(new ForumUser(9, "user9", 'M', LocalDate.of(2022,1,1), 3));
        userList.add(new ForumUser(10, "user10", 'M', LocalDate.of(1989,1,1), 150));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
