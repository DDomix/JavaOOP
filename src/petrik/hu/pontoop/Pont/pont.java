package petrik.hu.pontoop.Pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont(int n) {
        this.x = koordinatageneralasa(n);
        this.y = koordinatageneralasa(n);
    }

    private int koordinatageneralasa(int n) {
        return (int) (Math.random() * (2 * n + 1)) - n;
    }

    public double origotolmertavolsag() {
        return Math.sqrt((Math.pow(this.x, 2) + Math.pow(this.y, 2)));
    }

    public double ketponttavolsaga(Pont masikpont) {
        return Math.sqrt(Math.pow(this.x - masikpont.x, 2) + Math.pow(this.y - masikpont.y, 2));
    }

    public int getSiknegyed() {
        int siknegyed = 0;
        if (this.x < 0 && this.y > 0) {
            siknegyed = 1;
        } else if (this.x < 0 && this.y < 0) {
            siknegyed = 2;
        } else if (this.x > 0 && this.y < 0) {
            siknegyed = 3;
        } else if (this.x > 0 && this.y > 0) {
            siknegyed = 4;
        } else if (this.x == 0 && this.y != 0){
            siknegyed=5;
        }else if (this.x!=0&&this.y==0){
            siknegyed=6;
        }
        return siknegyed;
    }

    public  String getSiknegyedszovege(){
        int siknegyed=this.getSiknegyed();
        String siknegyedszovege="";
        switch (siknegyed){
            case 0:
                siknegyedszovege="origo";
                break;
            case 1:
                siknegyedszovege="bal felso";
                break;
            case 2:
                siknegyedszovege="bal also";
                break;
            case 3:
                siknegyedszovege="jobb also";
                break;
            case 4:
                siknegyedszovege="jobb felso";
                break;
            case 5:
                siknegyedszovege="függőleges tengely";
                break;
            case 6:
                siknegyedszovege="vízszintes tengely";
                break;
        }
        return siknegyedszovege;
    }

    @Override
    public String toString() {
        //return "(" + x + "," + y + ")";
        return String.format("(%d, %d)", this.x, this.y);
    }
}
