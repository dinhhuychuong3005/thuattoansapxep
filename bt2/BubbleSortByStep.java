package bt2;


import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSort(int [] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length && check; i++) {
            check = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = scanner.nextInt();
        int [] arr1 = new int[size];
        System.out.println("Nhập vào các phần tử của mảng");
        for (int i = 0;i< size;i++){
            System.out.println("Phần tử " + (i + 1) + " :");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu là :");
        for (int j : arr1) {
            System.out.println(j + " ,");
        }
        System.out.println("mảng sau khi sắp xếp là:");
        BubbleSortByStep.bubbleSort(arr1);
        for (int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i] + " ,");
        }
    }
}
