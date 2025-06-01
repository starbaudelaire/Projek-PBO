package Benda3D;

import Benda.Benda3D;
import Benda2D.Lingkaran;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Tabung extends Lingkaran implements Benda3D {
    private double tinggiTabung;
    private double volumeTabung;
    private double luasPermukaanTabung;

    public Tabung(double jariJari, double tinggiTabung) {
        super(jariJari);
        this.tinggiTabung = tinggiTabung;
        volumeTabung = hitungVolume();
        luasPermukaanTabung = hitungLuasPermukaan();
    }

    @Override
    public String getNama(){
        return "Tabung";
    }

    @Override
    public double hitungVolume() {

        return super.getLuasLingkaran() * tinggiTabung;
    }

    public double getVolumeTabung() {
        return volumeTabung;
    }

    @Override
    public double hitungLuasPermukaan() {
        return super.getKelilingLingkaran() * (super.jariJari + tinggiTabung);
    }

    public double getLuasPermukaanTabung() {
        return luasPermukaanTabung;
    }

}