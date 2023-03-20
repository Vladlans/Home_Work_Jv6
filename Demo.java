package Home_Work_Jv6;

public class Demo {
        
    public static void main(String[] args) {
        Notebook nb1 = new Notebook("Asus", 27000, 13, 4, "i3", 4, 512);
        Notebook nb2 = new Notebook("Asus", 30000, 13, 8, "i3", 8, 512);
        Notebook nb3 = new Notebook("Acer", 35000, 11, 8, "i5", 8, 512);
        Notebook nb4 = new Notebook("HP", 67000, 15, 12, "i7", 16, 1024);
        Notebook nb5 = new Notebook("Acer", 42300, 10, 8, "i5", 16, 1024);
        Notebook nb6 = new Notebook("Lenovo", 36000, 13, 8, "i5", 16, 512);
        Assortiment allNotebooks = new Assortiment(nb1, nb2, nb3, nb4, nb5, nb6);
        UserMenu.callMenu(allNotebooks);
    }
}