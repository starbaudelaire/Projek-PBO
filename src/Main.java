
import Benda.*;
import Benda2D.*;
import Benda3D.*;

public class Main {
    public static void main(String[] args) {
        BendaGeometri p1 = new Persegi(20);
        BendaGeometri p2 = new PersegiPanjang(12, 8);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread((Runnable) p2);

        t1.start();
        t2.start();
    }
}