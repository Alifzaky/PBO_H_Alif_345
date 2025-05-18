package com.praktikum.Data;

public class Item {
    private String namaItem;
    private String deskripsi;
    private String lokasi;
    private String status;

    public Item (String namaItem, String deksripsi, String lokasi){
        this.namaItem = namaItem;
        this.deskripsi = deksripsi;
        this.lokasi = lokasi;
        this.status = "Reported";
    }

    public String getNamaItem(){
        return namaItem;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public String getLokasi(){
        return lokasi;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
