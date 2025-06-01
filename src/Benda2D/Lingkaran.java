package Benda2D;

import Benda.BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Lingkaran implements BendaGeometri, Runnable {

    public double jariJari;
    private double luasLingkaran;
    private double kelilingLingkaran;
    public final double pi = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Lingkaran");
        this.luasLingkaran = hitungLuas();
        this.kelilingLingkaran = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        return pi * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * pi * jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getLuasLingkaran() {
        return luasLingkaran;
    }

    public double getKelilingLingkaran() {
        return kelilingLingkaran;
    }

    public double getPi() {
        return pi;
    }
}