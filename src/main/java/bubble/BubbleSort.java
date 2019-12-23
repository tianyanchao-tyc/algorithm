package bubble;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    /**
     * main
     * @param args args
     */
    public static void main(String[] args) {
        int[] sort1 = {3, 5, 6, 1, 9, 2, 15, 12, 13, 10};
        sort(sort1);
        System.out.println(Arrays.toString(sort1));
    }

    /***
     * 外层循环控制整个数组循环次数
     * 遍历完成一遍后从头开始继续遍历
     * 内层循环比较数组两个数的大小
     * 是否符合切换位置条件
     * 最好时时间复杂度O(1)
     * 最坏时时间复杂度O(n2)
     * @param sort1 sort
     */
    private static void sort(int[] sort1) {
        if (sort1 == null || sort1.length == 0) {
            return;
        }
        for (int i = 1; i < sort1.length; i++) {
            for (int j = 0; j < sort1.length - i; j++) {
                if (sort1[j] > sort1[j + 1]) {
                    Integer temp = sort1[j + 1];
                    sort1[j + 1] = sort1[j];
                    sort1[j] = temp;
                }
            }
        }
    }
}
