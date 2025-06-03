package com.praktikum.users;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class User {
    protected StringProperty nama;
    protected StringProperty nim;

    public User(String nama, String nim) {
        this.nama = new SimpleStringProperty(nama);
        this.nim = new SimpleStringProperty(nim);
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public String getNim() {
        return nim.get();
    }

    public void setNim(String nim) {
        this.nim.set(nim);
    }

    public StringProperty namaProperty() {
        return nama;
    }

    public StringProperty nimProperty() {
        return nim;
    }


    public abstract void displayAppMenu();

    public void displayInfo() {
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
    }


}
