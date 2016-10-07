/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueens;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 */
public class EightQueens extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ChessBoard chessBoard = new ChessBoard(10);
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println(chessBoard.getSize());
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Eight Queens Problem");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void setupBoard(){
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
    }
    
}
