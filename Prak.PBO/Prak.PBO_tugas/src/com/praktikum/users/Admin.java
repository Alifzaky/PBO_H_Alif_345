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

    }

    public void manageUser(){

    }

    @Override
    public void displayAppMenu() {

    }
}
