package Benda3D;

import Benda.Benda3D;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class JuringBola extends Bola implements Benda3D {
    private double theta;
    private double luasJuring;
    private double kelilingJuring;

    public JuringBola(double jariJari, double theta) {
        super(jariJari);
    }

    @Override
    public double hitungLuas() {
        return 0;
    }

    public double getLuasJuring() {
        return 0;
    }

    @Override
    public double hitungKeliling() {
        return 0;
    }

    public double getKelilingJuring() {
        return 0;
    }

}