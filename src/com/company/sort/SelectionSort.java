package com.company.sort;

/**
 * 选择排序
 * 遍历需要排序的数组， 按照顺序，将最大或最小的元素放到一个新数组中，直到所有元素排序完
 * 时间复杂度 O(n2)
 * @author ：Tony.L
 * @version ：2020 Version：1.0
 * @create ：2020/11/04 17:33
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = selectionSort(new int[]{5, 3, 6, 2});
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] selectionSort(int arr[]) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int smallIndex = findSamllestIndex(arr);
            ret[i] = arr[smallIndex];
            arr[smallIndex] = Integer.MAX_VALUE;
        }

        return ret;
    }

    public static int findSamllestIndex(int[] arr) {
        int smallest = arr[0];
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
