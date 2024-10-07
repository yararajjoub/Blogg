package org.example.View;

import org.example.Model.Post;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PostView extends JFrame {
    private JTextField titleField;
    private JTextArea contentArea;
    private JTextField authorField;
    private JButton addButton;
    private JButton showAllButton;
    private JTextArea postDisplayArea;

    public PostView() {
        setTitle("Blogg MVC");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel för inmatning av post
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 1));
        inputPanel.add(new JLabel("Title:"));
        titleField = new JTextField();
        inputPanel.add(titleField);

        inputPanel.add(new JLabel("Content:"));
        contentArea = new JTextArea(5, 20);
        inputPanel.add(new JScrollPane(contentArea));

        inputPanel.add(new JLabel("Author:"));
        authorField = new JTextField();
        inputPanel.add(authorField);

        // Knapp för att lägga till post
        addButton = new JButton("Add Post");
        inputPanel.add(addButton);

        // Panel för att visa alla poster
        postDisplayArea = new JTextArea();
        postDisplayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(postDisplayArea);

        // Knapp för att visa alla poster
        showAllButton = new JButton("Show All Posts");

        // Lägg till paneler till fönstret
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(showAllButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public String getTitleInput() {
        return titleField.getText();
    }

    public String getContentInput() {
        return contentArea.getText();
    }

    public String getAuthorInput() {
        return authorField.getText();
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getShowAllButton() {
        return showAllButton;
    }

    public void displayPosts(List<Post> posts) {
        postDisplayArea.setText("");
        for (Post post : posts) {
            postDisplayArea.append(post.toString() + "\n-----------------\n");
        }
    }

    public void clearInputs() {
        titleField.setText("");
        contentArea.setText("");
        authorField.setText("");
    }
}
