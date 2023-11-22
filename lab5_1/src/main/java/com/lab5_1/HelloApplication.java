package com.lab5_1;

import com.lab5_1.hibernate.HibernateUtils;
import com.lab5_1.models.User;
import com.lab5_1.models.UserServise;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 520, 440);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        Label welcomeText = new Label("");
        group.getChildren().addAll(welcomeText);
        VBox vBox = new VBox();
        HBox hBox = new HBox();


        HibernateUtils.getSessionFactory().openSession();
        List<User> userList = UserServise.getUserList();
        //String res = null;

        /*for (User user : userList) {
            res.concat(user.getEmail());
            res.concat(" ");
            res.concat(user.getPassword());
            res.concat("\n");
        }
        welcomeText.setText(res);*/
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}