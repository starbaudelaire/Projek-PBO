package Benda3D;

import Benda.Benda3D;
import Benda2D.Persegi;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PrismaPersegi extends Persegi implements Benda3D {
    private double volumeKubus;
    private double tinggiPrisma;
    private double luasPermukaanKubus;

    public PrismaPersegi(double sisi, double tinggi) {
        super(sisi);
        tinggiPrisma = tinggi;
        volumeKubus = hitungVolume();
        luasPermukaanKubus = hitungLuasPermukaan();
    }

    @Override
    public String getNama(){
        return "Prisma Persegi";
    }

    @Override
    public double hitungVolume() {
        return getLuasPersegi() * tinggiPrisma;
    }

    public double getVolumeKubus() {
        return volumeKubus;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2*getLuasPersegi() + getKelilingPersegi()*tinggiPrisma;
    }

    public double getLuasPermukaanKubus() {
        return luasPermukaanKubus;
    }

}