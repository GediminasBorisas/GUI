package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class MovieInputController {

    public void backButtonPushed(ActionEvent event) throws IOException
    {
        Parent welcomeScreenParent = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        Scene welcomeScreenScene = new Scene(welcomeScreenParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(welcomeScreenScene);
        window.show();
    }

    public void nextButtonPushed(ActionEvent event) throws IOException
    {
        Parent genreScreenParent = FXMLLoader.load(getClass().getResource("GenreScreen.fxml"));
        Scene genreScreenScene = new Scene(genreScreenParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(genreScreenScene);
        window.show();
    }

}