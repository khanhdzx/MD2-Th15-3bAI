package Th2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng : ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        Main arrayExample = new Main();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner= new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của 1 phần tử bất kỳ : ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị phần tử có chỉ số "+x+" là: "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn");
        }
    }

}
