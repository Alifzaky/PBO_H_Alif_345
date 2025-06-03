package Modul_6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

    public class main extends Application {
        private int randomNumber;
        private int jumlahTebakan;
        private TextField inputTebakan;
        private Label Lfeedback;
        private Label Ljumlah;
        private Button Btebak;

        Label icon1 = new Label("🎯");
        Label icon2 = new Label("✅");
        Label icon3 = new Label("\uD83D\uDD01 ");
        Label icon4 = new Label("\uD83C\uDFB2");
        Label icon5 = new Label("\t\uD83D\uDD3A");
        Label icon6 = new Label("\uD83D\uDD3B");

        private void generateAngka() {

            randomNumber = (int) (Math.random() * 100);
            jumlahTebakan = 0;
            inputTebakan.setPromptText("Masukkan angka tebakan");
            Ljumlah.setText("Jumlah percobaan : 0");
            Lfeedback.setText("");
            Btebak.setText("COBA TEBAK !");
            Btebak.setGraphic(icon4);
        }

        @Override
        public void start(Stage primaryStage) {

            Label welcome = new Label("Masukkan angka 1-100");
            welcome.setGraphic(icon1);
            welcome.setStyle("-fx-font-size : 25 px ; -fx-text-fill:red` ;");

            inputTebakan = new TextField();
            inputTebakan.setPromptText("🎯 Masukkan angka tebakan (1-100)");

            Btebak = new Button("COBA TEBAK !");
            Btebak.setGraphic(icon4);
            Btebak.setStyle("-fx-background-color : #59ec35 ; -fx-text-fill : black");

            Lfeedback = new Label();
            Lfeedback.setStyle("-fx-font-size: 14px; -fx-padding: 10 0 5 0");

            Ljumlah = new Label("Jumlah percobaan : ");

            inputTebakan.setOnAction(e -> Btebak.fire());

            generateAngka();

            Btebak.setOnAction(e -> {
                if (Btebak.getText().equalsIgnoreCase("Mau lagi?")) {
                    generateAngka();
                    inputTebakan.clear();
                    inputTebakan.requestFocus();
                    return;
                }
                String input = inputTebakan.getText();
                try {
                    int tebakan = Integer.parseInt(input);
                    jumlahTebakan++;
                    Ljumlah.setText("Jumlah percobaan : " + jumlahTebakan);

                    if (tebakan > randomNumber) {
                        Lfeedback.setText("Tebakan mu terlalu tinggi");
                        Lfeedback.setStyle("-fx-text-fill : red");
                        Lfeedback.setGraphic(icon5);
                        inputTebakan.setText("");
                    } else if (tebakan < randomNumber) {
                        Lfeedback.setText("Tebakan mu terlalu kecil");
                        Lfeedback.setStyle("-fx-text-fill : red");
                        Lfeedback.setGraphic(icon6);
                        inputTebakan.setText("");
                    } else {
                        Lfeedback.setText("Benar!");
                        Lfeedback.setStyle("-fx-text-fill : green");
                        Btebak.setText("Mau lagi?");
                        Btebak.setGraphic(icon3);
                    }
                } catch (NumberFormatException ex) {
                    Lfeedback.setText("Masukkan angka yang valid!");
                }
            });

            HBox inputBox = new HBox(10, inputTebakan, Btebak);
            inputBox.setAlignment(Pos.CENTER);

            VBox root = new VBox(10,welcome,Lfeedback, inputBox,Ljumlah);
            root.setAlignment(Pos.CENTER);
            root.setPadding(new Insets(20));
            root.setStyle("-fx-padding:20 ; -fx-background-color:#9cf5ef");

            Scene scene = new Scene(root, 350, 150);
            primaryStage.setTitle("Program tebak angka random");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }



