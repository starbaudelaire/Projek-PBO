package Benda3D;

import Benda.Benda3D;
import Benda2D.Lingkaran;

import java.io.*;
import java.util.*;

import static java.lang.Math.sqrt;

/**
 * 
 */
public class Kerucut extends Lingkaran implements Benda3D {
    private double tinggiKerucut;
    private double volumeKerucut;
    private double luasPermukaanKerucut;

    public Kerucut(double jariJari, double tinggiKerucut) {
        super(jariJari);
        this.tinggiKerucut = tinggiKerucut;
        luasPermukaanKerucut = hitungLuasPermukaan();
        volumeKerucut = hitungVolume();
    }

    @Override
    public double hitungVolume() {
        return (double)1/3 * getLuasLingkaran() * tinggiKerucut;
    }

    public double getVolumeKerucut() {
        return volumeKerucut;
    }

    @Override
    public double hitungLuasPermukaan() {
        return sqrt((super.jariJari * super.jariJari) + (tinggiKerucut * tinggiKerucut));
    }

    public double getLuasPermukaanKerucut() {
        return luasPermukaanKerucut;
    }

}