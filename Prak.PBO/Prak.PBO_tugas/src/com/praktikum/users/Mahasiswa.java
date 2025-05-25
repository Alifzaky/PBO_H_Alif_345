package com.praktikum.users;

import com.praktikum.actions.mahasiswaActions;
import com.praktikum.Data.Item;
import com.praktikum.main.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mahasiswa extends User implements mahasiswaActions {
    public Mahasiswa(String nama, String nim){

        super(nama,nim);
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

        Item newItem = new Item(namabarang,deskripsi,lokasi);
        Main.reportedItems.add(newItem);
        System.out.println(">> Laporan berhasil dikirimkan. Maturnuhunn :D <<");
    }

    @Override
    public void viewReportedItems(){
        if(Main.reportedItems.isEmpty()){
            System.out.println("Tidak ada laporan barang hilang");
        }else{
            for(Item it : Main.reportedItems){
                if              ("Reported".equals(it.getStatus())){
                    System.out.println("==== nama ==== deksripsi ==== lokasi ====");
                    System.out.printf("|||| %s |||| %s |||| %s \n", it.getNamaItem(),it.getDeskripsi(),it.getLokasi());
                }
            }
        }
    }

    @Override
    public void displayAppMenu(){
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Selamat datang ===");
            System.out.println("=== Login sebagai mahasiswa ===");
            System.out.println("=== Menu mahasiswa ===");
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
