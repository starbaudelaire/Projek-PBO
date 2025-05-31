package Benda2D;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class JuringLingkaran extends Lingkaran {
    public double sudut;
    private double luasJuringLingkaran;
    private double kelilingJuringLingkaran;

    public JuringLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
        luasJuringLingkaran = hitungLuas();
        kelilingJuringLingkaran = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        return getLuasLingkaran() * sudut;
    }

    public double getLuasJuringLingkaran() {
        return luasJuringLingkaran;
    }

    @Override
    public double hitungKeliling() {
        return 2 * jariJari + jariJari * sudut;
    }

    public double getKelilingJuringLingkaran() {
        return kelilingJuringLingkaran;
    }

}