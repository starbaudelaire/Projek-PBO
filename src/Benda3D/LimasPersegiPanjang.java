package Benda3D;

import Benda.Benda3D;
import Benda2D.PersegiPanjang;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class LimasPersegiPanjang extends PersegiPanjang implements Benda3D {
    public double volumeLimasPersegiPanjang;
    public double tinggiLimasPersegiPanjang;
    public double luasPermukaanLimasPersegiPanjang;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimasPersegiPanjang) {
        super(panjang, lebar);
        this.tinggiLimasPersegiPanjang = tinggiLimasPersegiPanjang;
        volumeLimasPersegiPanjang = hitungVolume();
        luasPermukaanLimasPersegiPanjang = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return (double)1/3 * getLuasPersegiPanjang() * tinggiLimasPersegiPanjang;
    }

    public double getVolumeLimasPersegiPanjang() {
        return volumeLimasPersegiPanjang;
    }

    @Override
    public double hitungLuasPermukaan() {
        return getLuasPersegiPanjang() + (super.panjang * tinggiLimasPersegiPanjang) + (super.lebar * tinggiLimasPersegiPanjang);
    }

    public double getLuasPermukaanLimasPersegiPanjang() {
        return hitungLuasPermukaan();
    }

}