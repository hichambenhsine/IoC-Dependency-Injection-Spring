package com.example.pres;

import com.example.dao.IDao;
import com.example.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d=(IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(d);

        System.out.println("RES="+metier.calcul());
    }
}
