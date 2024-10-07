package org.example;

import org.example.Controller.PostController;
import org.example.View.PostView;


        public class Main {
            public static void main(String[] args) {
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        PostView view = new PostView();
                        new PostController(view);
                    }
                });
            }
        }
