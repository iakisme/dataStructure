package sort;

public class selectionSortTest {

	//核心，不断选择剩余元素中的最小元素并将其和数组的第一个元素交换位置，再剩下的
	//元素中找到最小的元素与第二个元素交换，直至整个数组排序
    public static void selectionSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
            int min_index = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                } 
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
         } 
    }
}
