package com.praktikum.Data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
    private final StringProperty namaItem;
    private final StringProperty deskripsi;
    private final StringProperty lokasi;
    private final StringProperty status;

    public Item(String namaItem, String deskripsi, String lokasi) {
        this.namaItem = new SimpleStringProperty(namaItem);
        this.deskripsi = new SimpleStringProperty(deskripsi);
        this.lokasi = new SimpleStringProperty(lokasi);
        this.status = new SimpleStringProperty("Reported");
    }

    // Getter JavaFX-style
    public StringProperty namaItemProperty() { return namaItem; }
    public StringProperty deskripsiProperty() { return deskripsi; }
    public StringProperty lokasiProperty() { return lokasi; }
    public StringProperty statusProperty() { return status; }

    // Getter normal (opsional)
    public String getNamaItem() { return namaItem.get(); }
    public String getDeskripsi() { return deskripsi.get(); }
    public String getLokasi() { return lokasi.get(); }
    public String getStatus() { return status.get(); }

    // Setter
    public void setStatus(String s) { status.set(s); }
}
