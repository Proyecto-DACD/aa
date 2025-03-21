package org.example;

public class Information {
    private int stars;
    private int forks;
    private int issues;
    private int watchers;

    public Information(int forks, int issues, int stars, int watchers) {
        this.forks = forks;
        this.issues = issues;
        this.stars = stars;
        this.watchers = watchers;
    }

    public int getForks() {
        return forks;
    }

    public int getIssues() {
        return issues;
    }

    public int getStars() {
        return stars;
    }

    public int getWatchers() {
        return watchers;
    }
}
