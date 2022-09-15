package petrik.hu.pontoop;

import petrik.hu.pontoop.Pont.Pont;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        Pont[] pontok = new Pont[10];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(100);
        }
        for (Pont p : pontok) {
            System.out.println(p);
        }

        int legtavolabbipontindex = 0;
        for (int i = 1; i < pontok.length; i++) {
            if (pontok[legtavolabbipontindex].origotolmertavolsag() < pontok[i].origotolmertavolsag()) {
                legtavolabbipontindex = i;
            }
        }
        System.out.printf("legtávolabbi pont az origotol: %d pont melynek koordinatai: %s origotol mert tavolsaga:%.3f \n ",legtavolabbipontindex+1, pontok[legtavolabbipontindex],pontok[legtavolabbipontindex].origotolmertavolsag());

        System.out.printf("pont1: %s, pont2: %s , két pont tavolsaga%.3f",p3,p4,p3.ketponttavolsaga(p4));
        System.out.printf("A %s pont elhelyezkedese: %s \n",p3,p3.getSiknegyedszovege());
        System.out.printf("A %s pont elhelyezkedese: %s \n",p2,p2.getSiknegyedszovege());
        System.out.printf("A %s pont elhelyezkedese: %s \n",p4,p4.getSiknegyedszovege());
    }
}

