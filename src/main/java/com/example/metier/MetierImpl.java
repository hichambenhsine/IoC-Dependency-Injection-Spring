package com.example.metier;

import com.example.dao.IDao;

public class MetierImpl implements IMetier {

    IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 *Math.PI/2 *Math.cos(t);
        return res;
    }
}
