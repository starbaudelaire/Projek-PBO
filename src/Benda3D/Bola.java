package Benda3D;

import Benda.Benda3D;
import Benda2D.Lingkaran;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Bola extends Lingkaran implements Benda3D {
    private double volumeBola;
    private double luasPermukaanBola;

    public Bola(double jariJari) {
        super(jariJari);
        volumeBola = hitungVolume();
        luasPermukaanBola = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return (double)(4/3 * getLuasLingkaran() * jariJari);
    }

    public double getVolumeBola() {
        return volumeBola;
    }

    @Override
    public double hitungLuasPermukaan() {
        return getKelilingLingkaran() * super.jariJari * 2;
    }

    public double getLuasPermukaanBola() {
        return luasPermukaanBola;
    }

}