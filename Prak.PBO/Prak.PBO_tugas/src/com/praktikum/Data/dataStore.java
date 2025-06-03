package com.praktikum.Data;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class dataStore {
    public static ArrayList<User> userlist = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void initialize(){
        Admin admin = new Admin("Admin345","Password345");
        admin.setUsername("Admin345");
        admin.setPassword("Password345");
        userlist.add(admin);

        userlist.add(new Mahasiswa("Alif Zaky","202410370110345"));
        userlist.add(new Mahasiswa("Nasywa Muhammad","202410370110309"));
    }
}
