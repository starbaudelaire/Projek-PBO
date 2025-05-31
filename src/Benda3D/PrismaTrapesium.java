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
    private double volumePrismaTrapesium;
    private double luasPermukaanPrismaTrapesium;

    public PrismaTrapesium(double alasAtas, double alasBawah, double tinggi, double tinggiPrismaTrapesium) {
        super(alasAtas,alasBawah,tinggi);
    }

    @Override
    public double hitungVolume() {
        return 0;
    }

    public double getVolumePrismaTrapesium() {
        return 0;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 0;
    }

    public double getLuasPermukaanPrismaTrapesium() {
        return 0;
    }

}