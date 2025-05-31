package Benda3D;

import Benda.Benda3D;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class TemberengBola extends Bola implements Benda3D {
    private double theta;
    private double luasTembereng;
    private double kelilingTembereng;

    public TemberengBola(double jariJari, double theta) {
        super(jariJari);
    }

    @Override
    public double hitungLuas() {
        return 0;
    }

    public double getLuasTembereng() {
        return 0;
    }

    @Override
    public double hitungKeliling() {
        return 0;
    }

    public double getKelilingTembereng() {
        return 0;
    }

}