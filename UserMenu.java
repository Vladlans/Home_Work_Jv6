package Home_Work_Jv6;

import java.util.Scanner;

public class UserMenu {
    public static void printMenu() {
        System.out.println("Выберите необходимое действие");
        System.out.println("1 - выбрать по марке");
        System.out.println("2 - выбрать по цене");
        System.out.println("3 - выбрать по длине диагонали");
        System.out.println("4 - выбрать по объему оперативной памяти");
        System.out.println("5 - выбрать по типу процессора");
        System.out.println("6 - выбрать по количеству ядер");
        System.out.println("7 - выбрать по объему жесткого диска");
        System.out.println("8 - вывести на экран весь ассортимент");
        System.out.println("9 - завершить работу");
    }

    public static void callMenu(Assortiment allN) {
        Scanner iScan = new Scanner(System.in);
        while(true) {
            printMenu();
            int choice = iScan.nextInt();
            if (choice == 9) break;
            else {
            switch (choice) {
                case 1:
                    System.out.println("Введите название бренда:");
                    iScan.nextLine();
                    String userBrand = iScan.nextLine();
                    allN.choiceBrand(userBrand);
                    break;
                case 2:
                    System.out.println("Введите максимально допустимую стоимость:");
                    int userPrice = iScan.nextInt();
                    allN.choicePrice(userPrice);
                    break;
                case 3:
                    System.out.println("Введите желаемую диагональ экрана:");
                    int userDiagonal = iScan.nextInt();
                    allN.choiceDiagonal(userDiagonal);
                    break;
                case 4:
                    System.out.println("Введите минимальный объем ОЗУ:");
                    int userRam = iScan.nextInt();
                    allN.choiceRam(userRam);
                    break;
                case 5:
                    System.out.println("Введите желаемый тип процессора:");
                    iScan.nextLine();
                    String userCpu = iScan.nextLine();
                    allN.choiceCpu(userCpu);
                    break;
                case 6:
                    System.out.println("Введите минимальное количество ядер:");
                    int userCores = iScan.nextInt();
                    allN.choiceCores(userCores);
                    break;
                case 7:
                    System.out.println("Введите минимальный объем жесткого диска:");
                    int userSsd = iScan.nextInt();
                    allN.choiceSsd(userSsd);
                    break;
                case 8:
                    allN.printAll();
                }
            }
        }
        iScan.close();
    }
}