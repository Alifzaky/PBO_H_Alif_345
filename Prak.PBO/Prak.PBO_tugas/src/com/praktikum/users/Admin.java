package com.praktikum.users;

import com.praktikum.Data.Item;
import com.praktikum.actions.adminActions;
import com.praktikum.main.Main;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Admin extends User implements adminActions{
    private String username;
    private String password;

    public Admin(String nama, String nim){

        super(nama,nim);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username){

        this.username = username;
    }

    public void setPassword(String password){

        this.password = password;
    }


    @Override
    public void manageItems(){
       Scanner input = new Scanner(System.in);
       int pilihan = -1;

       do{
           System.out.println("====== Manage Item =====");
           System.out.println("1. Lihat laporan");
           System.out.println("2. Tandai barang hilang");
           System.out.println("0. kembali");

           try {
               pilihan = input.nextInt();
               input.nextLine();
           } catch (InputMismatchException e) {
               System.out.println("Input harus berupa angka");
               input.nextLine();
               continue;
           }
           switch (pilihan){
               case 1:
                   if(Main.reportedItems.isEmpty()){
                       System.out.println("Tidak ada laporan barang hilang");
                   }else {
                       for( Item it : Main.reportedItems){
                           System.out.printf("[%s] %s - %s - %s \n",it.getStatus(),it.getNamaItem(),it.getDeskripsi(),it.getLokasi());
                       }
                   }
                   break;
               case 2:
                   if(Main.reportedItems.isEmpty()){
                       System.out.println("Tidak ada laporan barang hilang");
                       break;
                   }
                   for (int i = 0; i < Main.reportedItems.size(); i++){
                       Item it = Main.reportedItems.get(i);
                       if("Reported".equals(it.getStatus())){
                           System.out.printf("%d. %s (%s \n)", i, it.getNamaItem(), it.getLokasi());
                       }
                   }
                   System.out.println("Pilih indeks barang : ");
                   try {
                       int idx = input.nextInt();
                       input.nextLine();

                       Item selected = Main.reportedItems.get(idx);
                       selected.setStatus("Claimed");
                       System.out.println("Barang berhasil ditandai 'Claimed'. ");
                   }catch (InputMismatchException e){
                       System.out.println("Input harus berupa angka");
                       input.nextLine();
                   }catch (IndexOutOfBoundsException e){
                       System.out.println("Indeks tidak valid");
                   }
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Input tidak valid");
           }
       }while (pilihan !=0);
    }

    public void manageUser(){
        Scanner input = new Scanner(System.in);
        int pilihan = -1;
        do {
            System.out.println("====== Manage users =====");
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Hapus mahasiswa");
            System.out.println("0. kembali");

            try {
                pilihan = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                continue;
            }
            switch (pilihan) {
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("NIM Mahasiswa: ");
                    String nim = input.nextLine();
                    Mahasiswa m = new Mahasiswa(nama, nim);
                    Main.userList.add(m);
                    System.out.println("Mahasiswa berhasil ditambah.");
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang dihapus: ");
                    String targetNim = input.nextLine();
                    Iterator<User> it = Main.userList.iterator();
                    boolean removed = false;
                    while (it.hasNext()) {
                        User u = it.next();
                        if (u instanceof Mahasiswa && targetNim.equals(u.getNim())) {
                            it.remove();
                            removed = true;
                        }
                    }
                    System.out.println(removed ? "Mahasiswa berhasil dihapus." : "Mahasiswa tidak ditemukan.");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }

    @Override
    public void displayAppMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Selamat datang ===");
            System.out.println("=== Login sebagai admin ===");
            System.out.println("=== Menu admin ===");
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
