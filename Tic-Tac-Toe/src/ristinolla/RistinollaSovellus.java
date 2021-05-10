package ristinolla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class RistinollaSovellus extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pelaaja v = Pelaaja.X;
        v.setArvo("X");
        String kenenVuoro = v.getArvo();
        int i = 1;
        List<Button> lista = new ArrayList<>();
        BorderPane asettelu = new BorderPane();
        Label vuoro = new Label();
        vuoro.setFont(Font.font("Monospaced", 40));
        vuoro.setText("Vuoro: " + kenenVuoro);
        asettelu.setTop(vuoro);
        
        Map<Integer, Button> mappi = new HashMap<>();
        
        Tarkistaja tar = new Tarkistaja(mappi);

        GridPane ruudukko = new GridPane();
        
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                Button b = new Button(" ");
                lista.add(b);
                mappi.put(i, b);
                i++;
                b.setFont(Font.font("Monospaced", 40));
                b.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (tar.onkoTaysi() == false && tar.kolmeMappi() == false) {
                            if (b.getText() == " ") {
                                b.setText(v.getArvo());
                                if (v.getArvo() == "X") {
                                    v.setArvo("O");
                                } else {
                                    v.setArvo("X");
                                }
                                vuoro.setText("Vuoro: " + v.getArvo());
                                if (tar.onkoTaysi() == true || tar.kolmeMappi() == true) {
                                    vuoro.setText("Loppu!");
                                }
                            }
                        }
                    }
                });
                ruudukko.add(b, x, y);
            }
        }
        
        asettelu.setCenter(ruudukko);

        Scene scene = new Scene(asettelu);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
