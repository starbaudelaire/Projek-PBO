package Benda3D;

import Benda.Benda3D;
import Benda2D.Trapesium;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PrismaTrapesium extends Trapesium implements Benda3D {
    private double tinggiPrismaTrapesium;
    private double sisiA, sisiB, sisiC, sisiD;
    private double volumePrismaTrapesium;
    private double luasPermukaanPrismaTrapesium;
    private double luasSisiTegak;

    public PrismaTrapesium(double alasAtas, double alasBawah, double tinggi, double tinggiPrismaTrapesium, double sisiA, double sisiB, double sisiC, double sisiD) {
        super(alasAtas,alasBawah,tinggi);
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sisiD = sisiD;
        this.tinggiPrismaTrapesium = tinggiPrismaTrapesium;
        this.luasSisiTegak = hitungLuasSisiTegak();
        volumePrismaTrapesium = hitungVolume();
        luasPermukaanPrismaTrapesium = hitungLuasPermukaan();
    }

    @Override
    public String getNama(){
        return "Prisma Trapesium";
    }

    @Override
    public double hitungVolume(){
        return super.hitungLuas() * tinggiPrismaTrapesium;
    }

    public double hitungLuasSisiTegak(){
        return sisiA + sisiB + sisiC + sisiD * tinggiPrismaTrapesium;
    }

    public double getVolumePrismaTrapesium() {
        return volumePrismaTrapesium;
    }

    @Override
    public double hitungLuasPermukaan(){
        return (2 * super.getLuasTrapesium()) + luasSisiTegak;
    }

    public double getLuasPermukaanPrismaTrapesium() {
        return luasPermukaanPrismaTrapesium;
    }

}