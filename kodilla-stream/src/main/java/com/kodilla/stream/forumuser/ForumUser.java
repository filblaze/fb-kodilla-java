package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int userPosts;

    public ForumUser(int id, String username, char sex, LocalDate birthday, int userPosts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.userPosts = userPosts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getUserPosts() {
        return userPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", userPosts=" + userPosts +
                '}';
    }
}
