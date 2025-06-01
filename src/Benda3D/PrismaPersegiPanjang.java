package Benda3D;

import Benda.Benda3D;
import Benda2D.PersegiPanjang;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PrismaPersegiPanjang extends PersegiPanjang implements Benda3D {
    private double tinggiBalok;
    private double volumeBalok;
    private double luasPermukaanBalok;

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiBalok) {
        super(panjang, lebar);
        this.tinggiBalok = tinggiBalok;
        volumeBalok = hitungVolume();
        luasPermukaanBalok = hitungLuasPermukaan();
    }

    @Override
    public String getNama(){
        return "Prisma Persegi Panjang";
    }

    @Override
    public double hitungVolume() {
        return getLuasPersegiPanjang() * tinggiBalok;
    }

    public double getVolumeBalok() {
        return volumeBalok;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (super.panjang * super.lebar + super.panjang * tinggiBalok + super.lebar * tinggiBalok);
    }

    public double getLuasPermukaanBalok() {
        return luasPermukaanBalok;
    }

}