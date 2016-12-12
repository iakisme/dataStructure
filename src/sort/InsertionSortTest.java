package sort;

public class InsertionSortTest {
/*
 * 核心：通过构建有序序列，对于没有排序的序列，在已经排序的序列中从后向前扫描，找到相应
 * 的位置插入
 */
    public static void main(String[] args) {
        int unsortedArray[] = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        insertionSort(unsortedArray);
        System.out.println("After sort: ");
        for (int item : unsortedArray) {
            System.out.print(item + " ");
        }
}
    public static void insertionSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int index = i, array_i = array[i];
            while (index > 0 && array[index - 1] > array_i) {
                array[index] = array[index - 1];
                index -= 1; }
            array[index] = array_i;
            /* print sort process */
            for (int item : array) {
                System.out.print(item + " ");
            }		
            System.out.println();
        }
}
}
