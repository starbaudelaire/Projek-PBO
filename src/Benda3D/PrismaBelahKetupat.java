package Benda3D;

import Benda.Benda3D;
import Benda2D.BelahKetupat;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PrismaBelahKetupat extends BelahKetupat implements Benda3D, Runnable{
    private double tinggiPrisma;
    private double sisiPrisma;
    private double volumePrismaBelahKetupat;
    private double luasPermukaanPrismaBelahKetupat;

    public PrismaBelahKetupat(double diagonal1, double diagonal2, double tinggiPrisma, double sisi) {
        super(diagonal1, diagonal2);
        this.tinggiPrisma = tinggiPrisma;
        this.sisiPrisma = sisi;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Prisma Belah Ketupat");
        this.volumePrismaBelahKetupat = hitungVolume();
        this.luasPermukaanPrismaBelahKetupat = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return getLuasBelahKetupat() * tinggiPrisma;
    }

    public double getVolumePrismaBelahKetupat() {
        return volumePrismaBelahKetupat;
    }

    @Override
    public double hitungLuasPermukaan() {
        return getLuasBelahKetupat() * (2 * sisiPrisma * tinggiPrisma);
    }

    public double getLuasPermukaanPrismaBelahKetupat() {
        return luasPermukaanPrismaBelahKetupat;
    }

}