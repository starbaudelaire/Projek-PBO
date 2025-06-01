package Benda3D;

import Benda.Benda3D;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class TemberengBola extends Bola implements Benda3D {
    private double theta;
    private double volumeTembereng;
    private double luasPermukaanTembereng;

    public TemberengBola(double jariJari, double theta) {
        super(jariJari);
        this.theta = theta;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Tembereng Bola");
        this.volumeTembereng = hitungVolume();
        this.luasPermukaanTembereng = hitungLuasPermukaan();
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