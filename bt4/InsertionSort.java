package bt4;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Nhập vào các phần tử của mảng");
        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử " + (i + 1) + " :");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu là :");
        for (int j : arr1) {
            System.out.println(j + " ,");
        }
        InsertionSort.insertionSort(arr1);
        System.out.println("Mảng sau khi sắp xếp là :");
        for (int j : arr1) {
            System.out.println(j + " ,");
        }
    }
    public static void insertionSort(int[] array){
        int pos,x;
        for (int i = 1;i<array.length;i++){
            x = array[i];
            pos = i;
            while (pos>0 && x < array[pos - 1]){
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
