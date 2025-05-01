package com.praktikum.users;

public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim){
        super(nama,nim);
    }

    @Override
    public void login(){
        if("Alif Zaky Nasywa Muhammad".equals(getNama()) &&
                "202410370110345".equals(getNim())){
            System.out.println("Login com.praktikum.users.Mahasiswa berhasil");
            displayInfo();
        }else {
            System.out.println("Login com.praktikum.users.Mahasiswa gagal");
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
    }
}
