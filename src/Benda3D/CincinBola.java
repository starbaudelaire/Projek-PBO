package Benda3D;

import Benda.Benda3D;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class CincinBola extends Bola implements Benda3D, Runnable {
    private double jariJariDalam;
    private double jarakDuaBidang;
    private double volumeCincinBola;
    private double luasPermukaanCincinBola;

    public CincinBola(double jariJari, double jariJariDalam, double jarakDuaBidang) {
        super(jariJari);
    }

    @Override
    public void run() {
        System.out.println("Menghitung Cinicin Bola");
        this.volumeCincinBola = hitungVolume();
        this.luasPermukaanCincinBola = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return 0;
    }

    public double getVolumeCincinBola() {
        return 0;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 0;
    }

    public double getLuasPermukaanCincinBola() {
        return 0;
    }

}