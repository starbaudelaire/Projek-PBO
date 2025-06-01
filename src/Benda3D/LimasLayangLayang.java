package Benda3D;

import Benda.Benda3D;
import Benda2D.LayangLayang;

import java.io.*;
import java.util.*;

public class LimasLayangLayang extends LayangLayang implements Benda3D {
    private double tinggiLimas;
    private double tinggiSisiTegak1;
    private double tinggiSisiTegak2;
    private double volumeLimasLayangLayang;
    private double luasPermukaanLimasLayangLayang;

    public LimasLayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2, double tinggiLimas, double tinggiSisiTegak1, double tinggiSisiTegak2) {
        super(diagonal1, diagonal2, sisi1, sisi2);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak1 = tinggiSisiTegak1;
        this.tinggiSisiTegak2 = tinggiSisiTegak2;
        volumeLimasLayangLayang = hitungVolume();
        luasPermukaanLimasLayangLayang = hitungLuas();
    }

    @Override
    public String getNama(){
        return "Limas Layang-Layang";
    }

    @Override
    public double hitungVolume() {
        return getLuasLayangLayang() * tinggiLimas;
    }

    public double getVolumeLimasLayangLayang() {
        return volumeLimasLayangLayang;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * super.sisi1 + getKelilingLayangLayang() * tinggiSisiTegak1;
    }

    public double getLuasPermukaanLimasLayangLayang() {
        return luasPermukaanLimasLayangLayang;
    }

}