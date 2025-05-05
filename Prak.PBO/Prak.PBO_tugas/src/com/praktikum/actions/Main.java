package com.praktikum.actions;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = null;
        int role;

        System.out.println("Pilih Login : ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Input : ");
        role = input.nextInt();
        input.nextLine();

        switch (role){
            case 1:
                System.out.println("Login admin");
                System.out.print("Masukkan Nama : ");
                String username = input.nextLine();
                System.out.print("Masukkan NIM : ");
                String password = input.nextLine();

                Admin admin = new Admin(username,password);
                System.out.print("Masukkan username : ");
                admin.setUsername(input.nextLine());

                System.out.print("Masukkan password : ");
                admin.setPassword(input.nextLine());

                admin.login();
                if ("Admin345".equals(admin.getNama()) && "Password345".equals(admin.getPassword())){
                    user = admin;
                    admin.displayAppMenu();
                }

                break;
            case 2:
                System.out.println("Login mahasiswa");
                System.out.print("Masukkan username : ");
                String namaMahasiswa = input.nextLine();
                System.out.print("Masukkan password : ");
                String passwordMahasiswa = input.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa,passwordMahasiswa);
                mahasiswa.login();

                if ("Alif Zaky Nasywa Muhammad".equals(mahasiswa.getNama()) &&
                        "202410370110345".equals(mahasiswa.getNim())) {
                    mahasiswa.displayAppMenu();
                }
                break;

            default:
                System.out.println("input tidak valid");

        }

    }
}
