package Home_Work_Jv6;

import java.util.ArrayList;

public class Assortiment {
    ArrayList<Notebook> listOfNotebook;

    Assortiment() {
        listOfNotebook = new ArrayList<>();
    }
    Assortiment(Notebook product) {
        listOfNotebook = new ArrayList<>();
        listOfNotebook.add(product);
    }
    Assortiment(Notebook ... product) {
        listOfNotebook = new ArrayList<>();
        for (Notebook p: product) listOfNotebook.add(p);
    }
    public void printAll() {
        for (Notebook n : listOfNotebook) {
            System.out.println(n.toString());
        }
    }

    public void choiceBrand (String s) {
        for (Notebook n: listOfNotebook) {
            if(n.brand.equals(s)) System.out.println(n.toString());
        }
    }

    public void choicePrice (int p) {
        for (Notebook n: listOfNotebook) {
            if(n.price <= p) System.out.println(n.toString());
        }
    }

    public void choiceDiagonal (int d) {
        for (Notebook n: listOfNotebook) {
            if(n.diagonal == d) System.out.println(n.toString());
        }
    }

    public void choiceRam (int r) {
        for (Notebook n: listOfNotebook) {
            if(n.ram >= r) System.out.println(n.toString());
        }
    }

    public void choiceCpu (String c) {
        for (Notebook n: listOfNotebook) {
            if(n.cpu.equals(c)) System.out.println(n.toString());
        }
    }

    public void choiceCores (int c) {
        for (Notebook n: listOfNotebook) {
            if(n.cores >= c) System.out.println(n.toString());
        }
    }

    public void choiceSsd (int s) {
        for (Notebook n: listOfNotebook) {
            if(n.ssd >= s) System.out.println(n.toString());
        }
    }
}