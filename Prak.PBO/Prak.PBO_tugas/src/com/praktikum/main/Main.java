package com.praktikum.main;

import com.praktikum.users.User;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.Data.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void inisialisasiData() {
        Admin defaultAdmin = new Admin("ALIP", "0000");
        defaultAdmin.setUsername("Admin345");
        defaultAdmin.setPassword("Password345");
        userList.add(defaultAdmin);

        Mahasiswa m1 = new Mahasiswa("Alif Zaky Nasywa Muhammad", "202410370110345");
        userList.add(m1);
    }

    public static Admin autentikasiAdmin(String username, String password) {
        for (User u : userList) {
            if (u instanceof Admin) {
                Admin a = (Admin) u;
                if (username.equals(a.getUsername()) && password.equals(a.getPassword())) {
                    return a;
                }
            }
        }
        return null;
    }

    public static Mahasiswa autentikasiMahasiswa(String nama, String nim) {
        for (User u : userList) {
            if (u instanceof Mahasiswa) {
                Mahasiswa m = (Mahasiswa) u;
                if (nama.equals(m.getNama()) && nim.equals(m.getNim())) {
                    return m;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inisialisasiData();

        while (true) {
            System.out.println("Pilih login");
            System.out.println("1. Login sebagai admin");
            System.out.println("2. Login sebagai mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Input: ");

            int role;
            try {
                role = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Input harus berupa angka");
                input.nextLine();
                continue;
            }
            if (role == 0) break;

            switch (role) {
                case 1:
                    System.out.println("====== Login admin ======");
                    System.out.print("Masukkan username: ");
                    String username = input.nextLine();
                    System.out.print("Masukkan password: ");
                    String password = input.nextLine();

                    Admin admin = autentikasiAdmin(username, password);
                    if (admin != null) {
                        admin.displayInfo();
                        admin.displayAppMenu();
                    } else {
                        System.out.println("Login gagal, username atau password salah");
                    }
                    break;

                case 2:
                    System.out.println("===== Login mahasiswa ======");
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();

                    Mahasiswa mhs = autentikasiMahasiswa(nama, nim);
                    if (mhs != null) {
                        mhs.displayInfo();
                        mhs.displayAppMenu();
                    } else {
                        System.out.println("Login gagal, nama atau NIM salah");
                    }
                    break;

                default:
                    System.out.println("Input tidak valid");
            }
        }

        System.out.println("Terima kasih sudah menggunakan sistem");
        input.close();
    }
}
