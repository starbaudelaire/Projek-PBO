package Benda2D;

import Benda.Benda2D;

/**
 * 
 */
public class PersegiPanjang extends Benda2D {

    public double panjang;
    public double lebar;
    private double luasPersegiPanjang;
    private double kelilingPersegiPanjang;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        luasPersegiPanjang = hitungLuas();
        kelilingPersegiPanjang = hitungKeliling();
    }

    @Override
    public String getNama(){
        return "Persegi Panjang";
    }

    @Override
    public double hitungLuas() {
        return lebar * panjang;
    }

    public double getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getKelilingPersegiPanjang() {
        return kelilingPersegiPanjang;
    }

}