//Написать простой калькулятор
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        float result = 0;
        Scanner iScannerFirstDigit = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        float FirstDigit = iScannerFirstDigit.nextInt();
        //iScanner.close();

        Scanner iScannerSecondDigit = new Scanner(System.in);
        System.out.printf("Введите второе число: ");
        float SecondDigit = iScannerSecondDigit.nextInt();
        //iScanner2.close();

        Scanner iScannerChar = new Scanner(System.in);
        System.out.printf("Введите знак операции: ");
        String sing = iScannerChar.next();
        iScannerChar.close();

        switch (sing){
            case  "+":{
                result = FirstDigit + SecondDigit;
                break;
            }
            case  "-":{
                result = FirstDigit - SecondDigit;
                break;
            }
            case  "*":{
                result = FirstDigit * SecondDigit;
                break;
            }
            case  "/":{
                result = FirstDigit / SecondDigit;
                break;
            }
        }
        System.out.println(result);
    }
}
