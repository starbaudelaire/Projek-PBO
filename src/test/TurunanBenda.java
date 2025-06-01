package test;

public abstract class TurunanBenda implements Benda, Runnable {
    String nama;

    public void getNama(){
        System.out.println(nama);
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}
