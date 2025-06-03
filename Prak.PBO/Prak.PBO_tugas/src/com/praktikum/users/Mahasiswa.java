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

    }

    @Override
    public void viewReportedItems(){

    }

    @Override
    public void displayAppMenu() {

    }
}
