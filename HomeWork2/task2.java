//2.Реализуйте алгоритм сортировки пузырьком числового массива,
//результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

public class task2 {
    static int count = 0;
    public static void main(String[] args){
        int count = 0;
        int temp = 0;
        int[] arr = new int[] {2, 8, 5, 7, 8, 7, 4, 65};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    WriteLog(arr);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void WriteLog(int[] arr){
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {
            count++;
            if(count <= 1){
                fh = new FileHandler("MyLogFile.log");
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);
            }

            logger.info(Arrays.toString(arr));
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
