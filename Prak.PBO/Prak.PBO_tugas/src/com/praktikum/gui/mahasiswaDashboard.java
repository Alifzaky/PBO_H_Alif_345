package com.praktikum.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import com.praktikum.Data.dataStore;
import com.praktikum.Data.Item;
import com.praktikum.users.Mahasiswa;

public class mahasiswaDashboard extends VBox {
    private TableView<Item> table;

    public mahasiswaDashboard(Stage stage, Mahasiswa mhs) {
        setSpacing(10);
        setPadding(new Insets(15));

        Label welcome = new Label("Selamat datang, " + mhs.getNama());
        HBox form = new HBox(10);

        TextField tfNama = new TextField();
        tfNama.setPromptText("Nama Barang");
        TextField tfDesk = new TextField();
        tfDesk.setPromptText("Deskripsi");
        TextField tfLokasi = new TextField();
        tfLokasi.setPromptText("Lokasi Terakhir");

        Button btnLaporkan = new Button("Laporkan");
        btnLaporkan.setOnAction(e -> {
            String nama = tfNama.getText();
            String desk = tfDesk.getText();
            String lokasi = tfLokasi.getText();
            if (!nama.isBlank() && !desk.isBlank() && !lokasi.isBlank()) {
                dataStore.reportedItems.add(new Item(nama, desk, lokasi));
                tfNama.clear(); tfDesk.clear(); tfLokasi.clear();
                updateTable();
            }
        });

        form.getChildren().addAll(tfNama, tfDesk, tfLokasi, btnLaporkan);

        table = new TableView<>();
        TableColumn<Item, String> colNama = new TableColumn<>("Nama");
        colNama.setCellValueFactory(data -> data.getValue().namaItemProperty());
        TableColumn<Item, String> colLokasi = new TableColumn<>("Lokasi");
        colLokasi.setCellValueFactory(data -> data.getValue().lokasiProperty());
        table.getColumns().addAll(colNama, colLokasi);

        updateTable();

        Button logout = new Button("Logout");
        logout.setOnAction(e -> stage.setScene(new Scene(new loginPane(stage), 400, 300)));

        getChildren().addAll(welcome, form, new Label("Daftar Laporan Anda"), table, logout);
    }

    private void updateTable() {
        ObservableList<Item> visibleItems = FXCollections.observableArrayList(
                dataStore.reportedItems.stream()
                        .filter(item -> "Reported".equals(item.getStatus()))
                        .toList()
        );
        table.setItems(visibleItems);
    }
}
