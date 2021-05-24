package bt3;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng:");
        int size = scanner.nextInt();
        Double [] arr = new Double[size];
        System.out.println("Nhập vào từng phần tử của mảng:");
        for (int i = 0;i<size;i++){
            System.out.println("Phần tử " + (i + 1)+ " :");
            arr[i] = scanner.nextDouble();
        }
        System.out.println("Mảng trước khi sắp xếp:");
        for (int i = 0;i<size;i++){
            System.out.print(arr[i] + " ,");
        }
        SelectionSort.selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0;i<size;i++){
            System.out.print(arr[i] + " ,");
        }
    }
    public static void selectionSort(Double[] arr){
        for (int i = 0;i<arr.length - 1;i++){
            double min = arr[i];
            int minIndex = i;
            for (int j = i + 1;j< arr.length;j++){
                if (min > arr[j]){
                     min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
