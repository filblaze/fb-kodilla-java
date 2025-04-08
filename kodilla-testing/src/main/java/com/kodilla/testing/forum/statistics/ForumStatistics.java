package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {

    private Statistics statistics;
    private List<String> usersNames;
    private int postsCount;
    private int commentsCount;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

    }

    public void showStatistics() {

    }

    public List<String> usersNames() {
        List<String> usersNames = new ArrayList<>();
        return usersNames;
    }

    public int postsCount() {
        return 100;
    }

    public int commentsCount() {
        return 100;
    }

    public double averagePostsPerUser() {
        return 100.0;
    }

    public double averageCommentsPerUser() {
        return 100.0;
    }

    public double averageCommentsPerPost() {
        return 100.0;
    }
}
