package com.praktikum.users;

import com.praktikum.actions.mahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements mahasiswaActions {
    public Mahasiswa(String nama, String nim){

        super(nama,nim);
    }

    @Override
    public void login(){
        if("Alif Zaky Nasywa Muhammad".equals(getNama()) &&
                "202410370110345".equals(getNim())){
            System.out.println("Login com.praktikum.users.Mahasiswa berhasil");
            displayInfo();
            displayAppMenu();
        }else {
            System.out.println("Login Mahasiswa gagal");
        }
    }

    @Override
    public void reportItems(){
        Scanner input = new Scanner(System.in);

        System.out.println("Nama barang: ");
        String namabarang = input.nextLine();

        System.out.println("Deskripsi barang : ");
        String deskripsi = input.nextLine();

        System.out.println("Lokasi terakhir: ");
        String lokasi = input.nextLine();

        System.out.println(">> Laporan berhasil dikirimkan. Terimakasih <<");
    }

    @Override
    public void viewReportedItems(){

        System.out.println(">> Fitur lihat laporan belum tersedia <<");
    }

    @Override
    public void displayAppMenu(){
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan barang hilang.");
            System.out.println("2. Lihat daftar laporan.");
            System.out.println("0. Logout");
            System.out.println("Pilih: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    reportItems();
                    break;
                case 2:
                    viewReportedItems();
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
