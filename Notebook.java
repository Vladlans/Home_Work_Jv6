package Home_Work_Jv6;
import java.util.StringJoiner;

public class Notebook {
    String brand;
    int price;
    int diagonal;
    int ram;
    String cpu;
    int cores;
    int ssd;
    
    
    Notebook() {
        brand = "indefined";
        price = -1;
        diagonal = -1;
        ram = -1;
        cpu = "indefined";
        cores = -1;
        ssd = -1;
        
    }

    Notebook(String b, int p, int d, int r, String cp, int co, int s) {
        brand = b;
        price = p;
        diagonal = d;
        ram = r;
        cpu = cp;
        cores = co;
        ssd = s;
        
    }

    public String toString () {
        String str = new StringJoiner(", ", Notebook.class.getSimpleName() + "[", "]")
        .add("brand='" + brand + "'")
        .add("price=" + price)
        .add("diagonal=" + diagonal)
        .add("ram=" + ram)
        .add("cpu='" + cpu + "'")
        .add("cores=" + cores)
        .add("ssd=" + ssd)
        .toString();
        return str;
    }
}