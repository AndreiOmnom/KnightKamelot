package com.company;

import java.util.Scanner;


public class Monstr {
    public String mname;
    public Double  menergy;
    public int priz;


    public Monstr(String mname, double menergy, int priz) {
        this.mname = mname;
        this.menergy = menergy;
        this.priz = priz;

    }


    @Override
    public String toString() {
        return "Имя монстра" + mname +
                "\nСила " + menergy +
                " \nНаграда за победу " +priz;


    }
}
