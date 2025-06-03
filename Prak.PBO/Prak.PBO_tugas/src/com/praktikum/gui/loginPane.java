package com.praktikum.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.praktikum.main.Main;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;

public class loginPane extends VBox {
    public loginPane(Stage stage){
        setSpacing(10);
        setPadding(new Insets(20));
        setAlignment(Pos.CENTER);

        Label Ltitle = new Label("Sistem login penemuan barang hilang");

        ComboBox<String> roleBox = new ComboBox<>();
        roleBox.getItems().addAll("Mahasiswa","Admin");
        roleBox.setValue("Mahasiswa");

        TextField Tnama = new TextField();
        Tnama.setPromptText("Nama/ username");

        PasswordField Tpassword = new PasswordField();
        Tpassword.setPromptText("NIM/ password");

        Label errorMsg = new Label();

        Button btnLogin = new Button("Login");
        btnLogin.setOnAction(e -> {
            String role = roleBox.getValue();
            String nama = Tnama.getText();
            String pass = Tpassword.getText();

            if(role.equals("Mahasiswa")){
                Mahasiswa m = Main.autentikasiMahasiswa(nama,pass);
                if(m != null){
                    stage.setScene(new Scene(new mahasiswaDashboard(stage, m),600,400));
                }else{
                    errorMsg.setText("Login gagal, silahkan periksa kredensial");
                }
            }else {
                Admin a = Main.autentikasiAdmin(nama,pass);
                if(a != null){
                    stage.setScene(new Scene(new adminDashboard(stage, a),800,500));
                }else{
                    errorMsg.setText("Login gagal, silahkan periksa kredensial");
                }
            }
        });
        getChildren().addAll(Ltitle, roleBox, Tnama, Tpassword, btnLogin, errorMsg);
    }
}
