package com.kodilla.testing.forum;

public class ForumComment {

    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String commentBody, String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;
        return getForumPost().equals(that.getForumPost()) && getCommentBody().equals(that.getCommentBody()) && getAuthor().equals(that.getAuthor());
    }

    @Override
    public int hashCode() {
        int result = getForumPost().hashCode();
        result = 31 * result + getCommentBody().hashCode();
        result = 31 * result + getAuthor().hashCode();
        return result;
    }
}
