package org.example.Controller;
import org.example.Model.Post;
import org.example.View.PostView;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PostController {
    private List<Post> posts;
    private PostView view;
    private int postIdCounter = 1;

    public PostController(PostView view) {
        this.posts = new ArrayList<>();
        this.view = view;

        // Lägg till lyssnare för knappar
        this.view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPost();
            }
        });

        this.view.getShowAllButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAllPosts();
            }
        });
    }

    private void addPost() {
        String title = view.getTitleInput();
        String content = view.getContentInput();
        String author = view.getAuthorInput();
        Post post = new Post(postIdCounter++, title, content, author);
        posts.add(post);
        view.clearInputs();
        JOptionPane.showMessageDialog(view, "Post added successfully!");
    }

    private void showAllPosts() {
        if (posts.isEmpty()) {
            JOptionPane.showMessageDialog(view, "No posts available.");
        } else {
            view.displayPosts(posts);
        }
    }
}
