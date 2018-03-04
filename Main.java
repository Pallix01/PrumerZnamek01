import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class Main extends Application {

    Stage window;
    int vysledek;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Výpočet průměru známek");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label znamka1 = new Label("Známka 1: ");
        GridPane.setConstraints(znamka1, 0, 0);

        Label znamka2 = new Label("Známka 2:");
        GridPane.setConstraints(znamka2, 0, 1);

        Label znamka3 = new Label("Známka 3:");
        GridPane.setConstraints(znamka3, 0, 2);

        Label znamka4 = new Label("Známka 4:");
        GridPane.setConstraints(znamka4, 0, 3);

        Label znamka5 = new Label("Známka 5:");
        GridPane.setConstraints(znamka5, 0, 4);

        Label znamka6 = new Label("Známka 6:");
        GridPane.setConstraints(znamka6, 0, 5);

        Label znamka7 = new Label("Známka 7:");
        GridPane.setConstraints(znamka7, 0, 6);

        Label znamka8 = new Label("Známka 8:");
        GridPane.setConstraints(znamka8, 0, 7);

        Label znamka9 = new Label("Známka 9:");
        GridPane.setConstraints(znamka9, 0, 8);

        Label znamka10 = new Label("Známka 10:");
        GridPane.setConstraints(znamka10, 0, 9);

        TextField zadani_znamky1 = new TextField();
        zadani_znamky1.setText("0");
        GridPane.setConstraints(zadani_znamky1, 1, 0);
        zadani_znamky1.setMaxSize(30, 10);

        TextField zadani_znamky2 = new TextField();
        zadani_znamky2.setText("0");
        GridPane.setConstraints(zadani_znamky2, 1, 1);
        zadani_znamky2.setMaxSize(30, 10);

        TextField zadani_znamky3 = new TextField();
        zadani_znamky3.setText("0");
        GridPane.setConstraints(zadani_znamky3, 1, 2);
        zadani_znamky3.setMaxSize(30, 10);

        TextField zadani_znamky4 = new TextField();
        zadani_znamky4.setText("0");
        GridPane.setConstraints(zadani_znamky4, 1, 3);
        zadani_znamky4.setMaxSize(30, 10);

        TextField zadani_znamky5 = new TextField();
        zadani_znamky5.setText("0");
        GridPane.setConstraints(zadani_znamky5, 1, 4);
        zadani_znamky5.setMaxSize(30, 10);

        TextField zadani_znamky6 = new TextField();
        zadani_znamky6.setText("0");
        GridPane.setConstraints(zadani_znamky6, 1, 5);
        zadani_znamky6.setMaxSize(30, 10);

        TextField zadani_znamky7 = new TextField();
        zadani_znamky7.setText("0");
        GridPane.setConstraints(zadani_znamky7, 1, 6);
        zadani_znamky7.setMaxSize(30, 10);

        TextField zadani_znamky8 = new TextField();
        zadani_znamky8.setText("0");
        GridPane.setConstraints(zadani_znamky8, 1, 7);
        zadani_znamky8.setMaxSize(30, 10);

        TextField zadani_znamky9 = new TextField();
        zadani_znamky9.setText("0");
        GridPane.setConstraints(zadani_znamky9, 1, 8);
        zadani_znamky9.setMaxSize(30, 10);

        TextField zadani_znamky10 = new TextField();
        zadani_znamky10.setText("0");
        GridPane.setConstraints(zadani_znamky10, 1, 9);
        zadani_znamky10.setMaxSize(30, 10);

        Label vaha1 = new Label("Váha 1: ");
        GridPane.setConstraints(vaha1, 2, 0);

        Label vaha2 = new Label("Váha 2: ");
        GridPane.setConstraints(vaha2, 2, 1);

        Label vaha3 = new Label("Váha 3: ");
        GridPane.setConstraints(vaha3, 2, 2);

        Label vaha4 = new Label("Váha 4: ");
        GridPane.setConstraints(vaha4, 2, 3);

        Label vaha5 = new Label("Váha 5: ");
        GridPane.setConstraints(vaha5, 2, 4);

        Label vaha6 = new Label("Váha 6: ");
        GridPane.setConstraints(vaha6, 2, 5);

        Label vaha7 = new Label("Váha 7: ");
        GridPane.setConstraints(vaha7, 2, 6);

        Label vaha8 = new Label("Váha 8: ");
        GridPane.setConstraints(vaha8, 2, 7);

        Label vaha9 = new Label("Váha 9: ");
        GridPane.setConstraints(vaha9, 2, 8);

        Label vaha10 = new Label("Váha 10: ");
        GridPane.setConstraints(vaha10, 2, 9);

        TextField zadani_vahy1 = new TextField();
        zadani_vahy1.setText("1");
        GridPane.setConstraints(zadani_vahy1, 3, 0);
        zadani_vahy1.setMaxSize(30, 10);

        TextField zadani_vahy2 = new TextField();
        zadani_vahy2.setText("1");
        GridPane.setConstraints(zadani_vahy2, 3, 1);
        zadani_vahy2.setMaxSize(30, 10);

        TextField zadani_vahy3 = new TextField();
        zadani_vahy3.setText("1");
        GridPane.setConstraints(zadani_vahy3, 3, 2);
        zadani_vahy3.setMaxSize(30, 10);

        TextField zadani_vahy4 = new TextField();
        zadani_vahy4.setText("1");
        GridPane.setConstraints(zadani_vahy4, 3, 3);
        zadani_vahy4.setMaxSize(30, 10);

        TextField zadani_vahy5 = new TextField();
        zadani_vahy5.setText("1");
        GridPane.setConstraints(zadani_vahy5, 3, 4);
        zadani_vahy5.setMaxSize(30, 10);

        TextField zadani_vahy6 = new TextField();
        zadani_vahy6.setText("1");
        GridPane.setConstraints(zadani_vahy6, 3, 5);
        zadani_vahy6.setMaxSize(30, 10);

        TextField zadani_vahy7 = new TextField();
        zadani_vahy7.setText("1");
        GridPane.setConstraints(zadani_vahy7, 3, 6);
        zadani_vahy7.setMaxSize(30, 10);

        TextField zadani_vahy8 = new TextField();
        zadani_vahy8.setText("1");
        GridPane.setConstraints(zadani_vahy8, 3, 7);
        zadani_vahy8.setMaxSize(30, 10);

        TextField zadani_vahy9 = new TextField();
        zadani_vahy9.setText("1");
        GridPane.setConstraints(zadani_vahy9, 3, 8);
        zadani_vahy9.setMaxSize(30, 10);

        TextField zadani_vahy10 = new TextField();
        zadani_vahy10.setText("1");
        GridPane.setConstraints(zadani_vahy10, 3, 9);
        zadani_vahy10.setMaxSize(30, 10);

        Button vypocti = new Button("Vypočti");
        GridPane.setConstraints(vypocti, 2, 11);
        vypocti.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double zadani_znamky01 = Double.parseDouble(zadani_znamky1.getText());
                double zadani_znamky02 = Double.parseDouble(zadani_znamky2.getText());
                double zadani_znamky03 = Double.parseDouble(zadani_znamky3.getText());
                double zadani_znamky04 = Double.parseDouble(zadani_znamky4.getText());
                double zadani_znamky05 = Double.parseDouble(zadani_znamky5.getText());
                double zadani_znamky06 = Double.parseDouble(zadani_znamky6.getText());
                double zadani_znamky07 = Double.parseDouble(zadani_znamky7.getText());
                double zadani_znamky08 = Double.parseDouble(zadani_znamky8.getText());
                double zadani_znamky09 = Double.parseDouble(zadani_znamky9.getText());
                double zadani_znamky010 = Double.parseDouble(zadani_znamky10.getText());

                double zadani_vahy01 = Double.parseDouble(zadani_vahy1.getText());
                double zadani_vahy02 = Double.parseDouble(zadani_vahy2.getText());
                double zadani_vahy03 = Double.parseDouble(zadani_vahy3.getText());
                double zadani_vahy04 = Double.parseDouble(zadani_vahy4.getText());
                double zadani_vahy05 = Double.parseDouble(zadani_vahy5.getText());
                double zadani_vahy06 = Double.parseDouble(zadani_vahy6.getText());
                double zadani_vahy07 = Double.parseDouble(zadani_vahy7.getText());
                double zadani_vahy08 = Double.parseDouble(zadani_vahy8.getText());
                double zadani_vahy09 = Double.parseDouble(zadani_vahy9.getText());
                double zadani_vahy010 = Double.parseDouble(zadani_vahy10.getText());

                if (zadani_znamky01 == 0){
                    zadani_vahy1.setText("0");
                }

                if (zadani_znamky02 == 0){
                    zadani_vahy2.setText("0");
                }

                if (zadani_znamky03 == 0){
                    zadani_vahy3.setText("0");
                }

                if (zadani_znamky04 == 0){
                    zadani_vahy4.setText("0");
                }

                if (zadani_znamky05 == 0){
                    zadani_vahy5.setText("0");
                }

                if (zadani_znamky06 == 0){
                    zadani_vahy6.setText("0");
                }

                if (zadani_znamky07 == 0){
                    zadani_vahy7.setText("0");
                }

                if (zadani_znamky08 == 0){
                    zadani_vahy8.setText("0");
                }

                if (zadani_znamky09 == 0){
                    zadani_vahy9.setText("0");
                }

                if (zadani_znamky010 == 0){
                    zadani_vahy10.setText("0");
                }

                double soucet_vah = zadani_vahy01 + zadani_vahy02
                        + zadani_vahy03 + zadani_vahy04
                        + zadani_vahy05 + zadani_vahy06
                        + zadani_vahy07 + zadani_vahy08
                        + zadani_vahy09 + zadani_vahy010;
                double vysledek = ((zadani_znamky01 * zadani_vahy01)
                        + (zadani_znamky02 * zadani_vahy02)
                        + (zadani_znamky03 * zadani_vahy03)
                        + (zadani_znamky04 * zadani_vahy04)
                        + (zadani_znamky05 * zadani_vahy05)
                        + (zadani_znamky06 * zadani_vahy06)
                        + (zadani_znamky07 * zadani_vahy07)
                        + (zadani_znamky08 * zadani_vahy08)
                        + (zadani_znamky09 * zadani_vahy09)
                        + (zadani_znamky010 * zadani_vahy010))
                        / soucet_vah;

                String vysledek_text = String.valueOf(vysledek);

                if (zadani_znamky01 <= 5 && zadani_znamky01 >=0 && zadani_znamky02 <= 5 && zadani_znamky02 >= 0
                    && zadani_znamky03 <= 5 && zadani_znamky03 >= 0 && zadani_znamky04 <= 5 && zadani_znamky04 >= 0
                    && zadani_znamky05 <= 5 && zadani_znamky05 >= 0 && zadani_znamky06 <= 5 && zadani_znamky06 >= 0
                    && zadani_znamky07 <= 5 && zadani_znamky07 >= 0 && zadani_znamky08 <= 5 && zadani_znamky08 >= 0
                    && zadani_znamky09 <= 5 && zadani_znamky09 >= 0 && zadani_znamky010 <= 5 && zadani_znamky010 >= 0){

                    TextField vystup = new TextField(vysledek_text);
                    GridPane.setConstraints(vystup, 2, 12);
                    vystup.setMaxSize(57, 30);
                    GridPane.setColumnSpan(vystup, 2);
                    grid.getChildren().add(vystup);
                }

                if (zadani_znamky01 > 5 || zadani_znamky01 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky01);
                if (zadani_znamky02 > 5 || zadani_znamky02 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky02);
                if (zadani_znamky03 > 5 || zadani_znamky03 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky03);
                if (zadani_znamky04 > 5 || zadani_znamky04 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky04);
                if (zadani_znamky05 > 5 || zadani_znamky05 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky05);
                if (zadani_znamky06 > 5 || zadani_znamky06 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky06);
                if (zadani_znamky07 > 5 || zadani_znamky07 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky07);
                if (zadani_znamky08 > 5 || zadani_znamky08 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky08);
                if (zadani_znamky09 > 5 || zadani_znamky09 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky09);
                if (zadani_znamky010 > 5 || zadani_znamky010 < 0) System.out.println("Zadána neplatná známka: " + zadani_znamky010);
            }
        });

        grid.getChildren().addAll(
                znamka1, znamka2, znamka3, znamka4, znamka5, znamka6, znamka7, znamka8, znamka9, znamka10,
                zadani_znamky1, zadani_znamky2, zadani_znamky3, zadani_znamky4, zadani_znamky5, zadani_znamky6, zadani_znamky7, zadani_znamky8, zadani_znamky9, zadani_znamky10,
                vaha1, vaha2, vaha3, vaha4, vaha5, vaha6, vaha7, vaha8, vaha9, vaha10,
                zadani_vahy1, zadani_vahy2, zadani_vahy3, zadani_vahy4, zadani_vahy5, zadani_vahy6, zadani_vahy7, zadani_vahy8, zadani_vahy9, zadani_vahy10,
                vypocti
        );

        Scene scene = new Scene(grid, 300, 500);
        window.setScene(scene);
        window.show();
    }
}
