
import Benda.*;
import Benda2D.*;
import Benda3D.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Lingkaran");
            System.out.print("Masukkan Jari Jari : ");
            double r = input.nextDouble();
            if(r <= 0){
                throw new ArithmeticException("Jari Jari tidak valid");
            }else{
                Lingkaran lingkaran = new Lingkaran(r);
                System.out.println("\n Informasi : ");
                System.out.println("Jari Jari : " + lingkaran.getJariJari());
                System.out.println("Luas Lingkaran : " + lingkaran.getLuasLingkaran());
                System.out.println("Keliling Lingkaran : " + lingkaran.getKelilingLingkaran());
            }
        }catch(ArithmeticException e){
            System.out.println("Error : " + e.getLocalizedMessage());
        }

        System.out.println();

        try{
            System.out.println("Balok");
            System.out.print("Masukkan Panjang : ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan Lebar : ");
            double lebar = input.nextDouble();
            System.out.print("Masukkan Tinggi : ");
            double tinggi = input.nextDouble();
            if(panjang <= 0 || lebar <= 0 || tinggi <= 0){
                throw new ArithmeticException("Input tidak valid");
            }else{
                PrismaPersegiPanjang balok = new PrismaPersegiPanjang(panjang, lebar, tinggi);
                System.out.println("\n Informasi : ");
                System.out.println("Panjang : " + panjang);
                System.out.println("Lebar : " + lebar);
                System.out.println("Tinggi : " + tinggi);
                System.out.println("Volume : " + balok.getVolumeBalok());
                System.out.println("Luas Permukaan : " + balok.getLuasPermukaanBalok());
            }
        }catch(ArithmeticException e){
            System.out.println("Error : " + e.getLocalizedMessage());
        }
    }
}