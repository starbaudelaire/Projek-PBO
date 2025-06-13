package Benda2D;

import Benda.Benda2D;

/**
 * 
 */
public class Persegi extends Benda2D implements Runnable {

    public double sisi;
    private double luasPersegi;
    private double kelilingPersegi;

    public Persegi(double sisi) {
        this.sisi = sisi;

        try{
            if(sisi <= 0){
                throw new ArithmeticException();
            }
        }catch(ArithmeticException e){
            System.out.println("Error : " + e.getLocalizedMessage());
        }

    }

    @Override
    public void run() {
        System.out.println("Menghitung Persegi");
        luasPersegi = hitungLuas();
        kelilingPersegi = hitungKeliling();
    }

    @Override
    public String getNama(){
        return "Persegi";
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    public double getLuasPersegi() {
        return luasPersegi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double getKelilingPersegi() {
        return kelilingPersegi;
    }

}