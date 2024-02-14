package alpinisti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    }

    Alpinisti alpinisti1 = new Alpinisti("Ivan",25,"kolpino",1);
    Alpinisti alpinisti2 = new Alpinisti("Roman", 18, "kolpino", 1);
    Alpinisti alpinisti3 = new Alpinisti("Maksim",19,"kolpino",1);
    Alpinisti alpinisti4 = new Alpinisti("Nazar", 18, "kolpino", 2);

        public static void createAlpinisti(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Набор в первую группу:");
        System.out.println("Введите нет чтобы закрыть набор или да чтобы открыть его");
        scanner.nextLine();
        if (scanner.nextLine() == "нет"){

        }
        else if (scanner.nextLine() == "да") {
            System.out.println("Введите данные для первого альпениста:");
            System.out.println("Имя - ");

        }
    }

}
