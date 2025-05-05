package com.praktikum.users;

import com.praktikum.actions.adminActions;
import java.util.Scanner;

public class Admin extends User implements adminActions{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public Admin(String nama, String nim){

        super(nama,nim);
    }

    public void setUsername(String username){

        this.username = username;
    }

    public void setPassword(String password){

        this.password = password;
    }

    @Override
    public void login(){
        if ("Admin345".equals(username) && "Password345".equals(password)) {
            displayInfo();
            displayAppMenu();
        } else {
            System.out.println("Login gagal! Username atau password salah");
        }
    }

    @Override
    public void manageItems(){
        System.out.println(">> Fitur kelola barang belum tersedia <<");
    }

    public void manageUser(){
        System.out.println(">> Fitur kelola user belum tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Menu Admin ===");
            System.out.println("1. Kelola laporan barang.");
            System.out.println("2. Kelola data Mahasiswa.");
            System.out.println("0. Logout");
            System.out.println("Pilih: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUser();
                    break;
                case 0:
                    System.out.println("Logout berhasil");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }while (pilihan != 0);
    }
}
