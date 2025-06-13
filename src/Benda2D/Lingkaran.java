package Benda2D;

import Benda.Benda2D;

/**
 * 
 */
public class Lingkaran extends Benda2D implements Runnable{

    public double jariJari;
    private double luasLingkaran;
    private double kelilingLingkaran;
    public final double pi = Math.PI;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Lingkaran");
        luasLingkaran = hitungLuas();
        kelilingLingkaran = hitungKeliling();
    }

    @Override
    public String getNama(){
        return "Lingkaran";
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