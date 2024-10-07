package org.example.Model;

import java.time.LocalDateTime;

public class Post {
    private int id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;

    public Post(int id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = LocalDateTime.now();
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getAuthor() { return author; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nContent: " + content +
                "\nAuthor: " + author + "\nCreated At: " + createdAt;
    }
}
