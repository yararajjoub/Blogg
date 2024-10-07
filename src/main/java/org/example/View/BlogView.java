package org.example.View;


import javax.swing.*;
import java.awt.*;

public class BlogView extends JFrame {
    // Definiera komponenter som du kan använda för att dynamiskt uppdatera din View
    private JPanel mainPanel;
    private JTextArea postTextArea;
    private JButton submitButton;
    private JList<String> postsList;
    private DefaultListModel<String> postsListModel;

    public BlogView() {
        // Inställningar för JFrame
        setTitle("Blogg Site");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Initiera huvudpanelen
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Skapa och konfigurera komponenter
        createComponents();

        // Lägg till huvudpanelen till JFrame
        add(mainPanel);

        // Gör ramen synlig
        setVisible(true);
    }

    private void createComponents() {
        // Panel för att skriva nya inlägg
        JPanel postPanel = new JPanel();
        postPanel.setLayout(new BorderLayout());

        JLabel postLabel = new JLabel("Skriv ett nytt inlägg:");
        postPanel.add(postLabel, BorderLayout.NORTH);

        postTextArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(postTextArea);
        postPanel.add(scrollPane, BorderLayout.CENTER);

        submitButton = new JButton("Posta");
        postPanel.add(submitButton, BorderLayout.SOUTH);

        // Panel för att visa en lista av inlägg
        postsListModel = new DefaultListModel<>();
        postsList = new JList<>(postsListModel);
        JScrollPane listScrollPane = new JScrollPane(postsList);

        // Lägg till komponenterna i huvudpanelen
        mainPanel.add(postPanel, BorderLayout.NORTH);
        mainPanel.add(listScrollPane, BorderLayout.CENTER);
    }

    // Metoder för att hämta komponenterna så att Controller kan arbeta med dem
    public JTextArea getPostTextArea() {
        return postTextArea;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public DefaultListModel<String> getPostsListModel() {
        return postsListModel;
    }

    public JList<String> getPostsList() {
        return postsList;
    }

    // Metod för att lägga till ett nytt inlägg i listan
    public void addPost(String postContent) {
        postsListModel.addElement(postContent);
    }
}
