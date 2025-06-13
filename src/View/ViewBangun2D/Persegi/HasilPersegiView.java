package View.ViewBangun2D.Persegi;

import Benda.*;
import Benda2D.*;

public class HasilPersegiView implements Runnable {
    double sisi;
    Persegi persegi;
    public HasilPersegiView(Persegi persegi) {
        this.persegi = persegi;
    }

    @Override
    public void run(){
        Print();
    }

    public void Print() {
        System.out.println("Hasil persegi");
        System.out.println("Luas : " + persegi.getLuasPersegi());
        System.out.println("Keliling : " + persegi.getKelilingPersegi());
    }
}
