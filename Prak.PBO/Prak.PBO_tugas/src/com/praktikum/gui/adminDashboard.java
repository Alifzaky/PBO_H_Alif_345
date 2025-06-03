package com.praktikum.gui;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import com.praktikum.Data.dataStore;
import com.praktikum.Data.Item;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
public class adminDashboard extends HBox {

    public adminDashboard(Stage stage, Admin admin) {
        setSpacing(10);
        setPadding(new Insets(10));

        VBox laporanPane = new VBox(10);
        Label lblAdmin = new Label("Halo, Administrator " + admin.getUsername());

        TableView<Item> laporanTable = new TableView<>(FXCollections.observableArrayList(dataStore.reportedItems));
        TableColumn<Item, String> colNama = new TableColumn<>("Nama");
        colNama.setCellValueFactory(d -> d.getValue().namaItemProperty());
        TableColumn<Item, String> colLokasi = new TableColumn<>("Lokasi");
        colLokasi.setCellValueFactory(d -> d.getValue().lokasiProperty());
        TableColumn<Item, String> colStatus = new TableColumn<>("Status");
        colStatus.setCellValueFactory(d -> d.getValue().statusProperty());
        laporanTable.getColumns().addAll(colNama, colLokasi, colStatus);

        Button btnClaim = new Button("Tandai Claimed");
        btnClaim.setOnAction(e -> {
            Item selected = laporanTable.getSelectionModel().getSelectedItem();
            if (selected != null) selected.setStatus("Claimed");
            laporanTable.refresh();
        });

        laporanPane.getChildren().addAll(lblAdmin, laporanTable, btnClaim);

        VBox userPane = new VBox(10);
        Label lblUser = new Label("Data Mahasiswa");
        TableView<Mahasiswa> userTable = new TableView<>();
        TableColumn<Mahasiswa, String> colUser = new TableColumn<>("Nama");
        colUser.setCellValueFactory(d -> d.getValue().namaProperty());
        TableColumn<Mahasiswa, String> colNim = new TableColumn<>("NIM");
        colNim.setCellValueFactory(d -> d.getValue().nimProperty());
        userTable.getColumns().addAll(colUser, colNim);
        userTable.setItems(FXCollections.observableArrayList(
                dataStore.userlist.stream().filter(u -> u instanceof Mahasiswa).map(u -> (Mahasiswa) u).toList()
        ));

        TextField tfNama = new TextField(); tfNama.setPromptText("Nama Mahasiswa");
        TextField tfNim = new TextField(); tfNim.setPromptText("NIM");
        Button btnAdd = new Button("Tambah");
        btnAdd.setOnAction(e -> {
            dataStore.userlist.add(new Mahasiswa(tfNama.getText(), tfNim.getText()));
            userTable.setItems(FXCollections.observableArrayList(
                    dataStore.userlist.stream().filter(u -> u instanceof Mahasiswa).map(u -> (Mahasiswa) u).toList()
            ));
            tfNama.clear(); tfNim.clear();
        });

        Button btnDel = new Button("Hapus");
        btnDel.setOnAction(e -> {
            dataStore.userlist.removeIf(u -> u instanceof Mahasiswa && ((Mahasiswa) u).getNim().equals(tfNim.getText()));
            userTable.setItems(FXCollections.observableArrayList(
                    dataStore.userlist.stream().filter(u -> u instanceof Mahasiswa).map(u -> (Mahasiswa) u).toList()
            ));
            tfNim.clear(); tfNama.clear();
        });

        Button logout = new Button("Logout");
        logout.setOnAction(e -> stage.setScene(new Scene(new loginPane(stage), 400, 300)));

        userPane.getChildren().addAll(lblUser, userTable, tfNama, tfNim, new HBox(5, btnAdd, btnDel), logout);

        getChildren().addAll(laporanPane, userPane);
    }

}
