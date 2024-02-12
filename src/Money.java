import java.util.Scanner;

public class Money {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу зп: ");
        int salary = scanner.nextInt();
        System.out.println("Введите планируемую затрату на транспорт: ");
        int transportPay = scanner.nextInt();
        System.out.println("Введите плнаиркемые затраты на еду: ");
        int eatPay = scanner.nextInt();
        System.out.println("Введите ссколько вы хотите отлошить денег: ");
        int saveMoney = scanner.nextInt();
        int allExpensess = transportPay + eatPay + saveMoney;
        moneyHelp(salary, transportPay, eatPay, allExpensess, saveMoney);
    }



    public static void moneyHelp(int salary, int transportPay, int eatPay, int allExpensess, int saveMoney){
        int remainder = salary - allExpensess;
        if (salary < allExpensess){
            System.out.println("Уменьшите количество затрат, либо найдите работу где больше платят");
        }
        else if (salary/2 < transportPay){
            System.out.println("Слишком много затрат на транспорт, ищите другой способ передвижения");
        }
        else if (salary/2 < eatPay){
            System.out.println("Кушайте меньше, либо выбирайте еду по дешевле. Слишкли много трат на еду");
        }
        else if (salary > allExpensess){
            System.out.println("Остаток средств: " + remainder + " можно отложить");
        }
    }
}
