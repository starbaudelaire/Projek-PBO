package Benda3D;

import Benda.Benda3D;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class JuringBola extends Bola implements Benda3D, Runnable {
    private double theta;
    private double luasJuring;
    private double kelilingJuring;
    private double volumeJuring;
    private double luasPermukaanJuring;

    public JuringBola(double jariJari, double theta) {
        super(jariJari);
    }

    @Override
    public void run() {
        System.out.println("Menghitung Juring Bola");
        this.volumeJuring = hitungVolume();
        this.luasPermukaanJuring = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return 0;
    }

    public double getVolume() {
        return 0;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 0;
    }

    public double getLuasPermukaanJuring() {
        return 0;
    }

}