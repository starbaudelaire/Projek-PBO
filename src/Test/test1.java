package Test;

import Benda.Benda2D;
import Benda2D.Lingkaran;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();
        new TestView(nama);
    }
}
