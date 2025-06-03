package com.praktikum.main;

import com.praktikum.Data.dataStore;
import com.praktikum.users.User;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;


public class Main {
    public static Admin autentikasiAdmin(String username, String password) {
        for (User u : dataStore.userlist) {
            if (u instanceof Admin a) {
                if (a.getUsername().equals(username) && a.getPassword().equals(password)){
                    return a;
                }
            }
        }
        return null;
    }

    public static Mahasiswa autentikasiMahasiswa(String nama, String nim) {
        for (User u : dataStore.userlist) {
            if (u instanceof Mahasiswa m) {
                if (m.getNama().equals(nama) && m.getNim().equals(nim)) {
                    return m;
                }
            }
        }
        return null;
    }


    }

