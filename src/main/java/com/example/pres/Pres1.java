package com.example.pres;


import com.example.dao.DaoImpl;
import com.example.dao.IDao;
import com.example.metier.IMetier;
import com.example.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IDao d = new DaoImpl();
        IMetier metier = new MetierImpl(d);
        System.out.println("RES= "+metier.calcul());
    }
}
