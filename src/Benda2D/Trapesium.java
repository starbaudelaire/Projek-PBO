package Benda2D;

import Benda.Benda2D;

/**
 * 
 */
public class Trapesium extends Benda2D {
    public double sisiSejajar1;
    public double sisiSejajar2;
    public double tinggi;
    public double sisiMiring;
    private double luasTrapesium;
    private double kelilingTrapesium;

    public Trapesium(double sisiSejajar1, double sisiSejajar2, double tinggi) {
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.tinggi = tinggi;
        this.sisiMiring = 0;
    }

    @Override
    public String getNama(){
        return "Trapesium";
    }

    @Override
    public double hitungLuas() {
        return 0.5 * (sisiSejajar1 * sisiSejajar2) * tinggi;
    }

    public double getLuasTrapesium() {
        return luasTrapesium;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (sisiSejajar1 + sisiSejajar2);
    }

    public double getKelilingTrapesium() {
        return kelilingTrapesium;
    }

}