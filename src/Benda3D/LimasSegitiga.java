package Benda3D;

import Benda.Benda3D;
import Benda2D.Segitiga;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class LimasSegitiga extends Segitiga implements Benda3D {
    private double tinggiLimasSegitiga;
    private double volumeLimasSegitiga;
    private double luasPermukaanLimasSegitiga;
    private double totalSisi;

    public LimasSegitiga(double alas, double tinggi, double tinggiLimasSegitiga, double sisi1, double sisi2, double sisi3) {
        super(alas, tinggi);
        this.tinggiLimasSegitiga = tinggiLimasSegitiga;
        totalSisi = sisi1 + sisi2 + sisi3;
        volumeLimasSegitiga = hitungVolume();
        luasPermukaanLimasSegitiga = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return (double)1/3 * (tinggiLimasSegitiga * getLuasSegitiga());
    }

    public double getVolumeLimasSegitiga() {
        return volumeLimasSegitiga;
    }

    @Override
    public double hitungLuasPermukaan() {
        return getLuasSegitiga() + totalSisi;
    }

    public double getLuasPermukaanLimasPersegiPanjang() {
        return luasPermukaanLimasSegitiga;
    }

}