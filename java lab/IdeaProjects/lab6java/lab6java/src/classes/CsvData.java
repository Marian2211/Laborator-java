package classes;

public class CsvData implements Comparable<CsvData>{
    String fruit;
    double x;
    double y ;


    public CsvData(double x, double y, String fruit) {
        this.x = x;
        this.y = y;
        this.fruit = fruit;

    }

    public int compareTo(CsvData other){
        return Double.compare(this.x, other.x);
    }

    @Override
    public String toString() {
        return  "x=" + x +
                ", y=" + y +
                ", fruit=" + fruit ;
    }
}