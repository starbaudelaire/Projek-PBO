package Benda3D;

import Benda.Benda3D;
import Benda2D.JajarGenjang;

import java.io.*;
import java.util.*;

public class PrismaJajarGenjang extends JajarGenjang implements Benda3D, Runnable {
    private double tinggiPrismaJajarGenjang;
    private double sisiPrismaJajarGenjang;
    private double volumePrismaJajarGenjang;
    private double luasPermukaanPrismaJajarGenjang;

    public PrismaJajarGenjang(double alas, double tinggi, double sudutLancip, double tinggiPrismaJajarGenjang, double sisi) {
        super(alas, sudutLancip, tinggi);
        this.tinggiPrismaJajarGenjang = tinggi;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Prisma Jajar Genjang");
        this.volumePrismaJajarGenjang = hitungVolume();
        this.luasPermukaanPrismaJajarGenjang = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return getLuasJajarGenjang() * tinggiPrismaJajarGenjang;
    }

    public double getVolumePrismaJajarGenjang() {
        return volumePrismaJajarGenjang;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * getLuasJajarGenjang() + 2 * hitungLuas(sisiPrismaJajarGenjang) + 2 * hitungLuas(tinggiPrismaJajarGenjang * sisiPrismaJajarGenjang);
    }

    public double getLuasPermukaanPrismaJajarGenjang() {
        return hitungLuasPermukaan();
    }

}