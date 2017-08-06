package collection;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        copyArray();//复制数组
        expansionArray();//数组扩容
        System.out.println();
        mergeSort();//合并数组并排序
        System.out.println();
        countPosition(3);//统计3在数组中的位置
        System.out.println();
        sort();//数组排序
        System.out.println();
        search();//查找
    }

    public static void search() {
        Integer[] array1 = {1, 2, 3, 4, 8, 3, 7, 5, 9, 0};
        int index = Arrays.binarySearch(array1, 3);
        System.out.println("array 查找：" + index);
        index = erFenSearch(array1, 3);
        System.out.println("二分法：" + index);
    }

    //二分查找法
    public static int erFenSearch(Integer[] array, int key) {
        int start = 0;
        int end = array.length - 1;
            while (start < end) {
                int mid = (start + end) / 2;
                if(key < array[mid]) {
                    end = mid -1;
                } else if (key > array[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        return -1;
    }

    //数组排序
    public static void sort() {
        Integer[] array1 = {1, 9, 3, 7, 8, 3, 4, 5, 2, 0};
        Arrays.sort(array1);
        System.out.println("------排序------");
        /*System.out.println("Arrays.sort()排序：" + Arrays.toString(array1));
        maoPao(array1);//冒泡排序
        System.out.println();
        selectSort(array1);//选择排序
        System.out.println();*/
        insertSort(array1);//插入排序
        System.out.println();
        quickQort(array1, 0, array1.length - 1);//快速排序
    }

    public static void quickQort(Integer[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[low];


        while(end>start){
            //从后往前比较
            while(end>start&&a[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while(end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        //if(start>low) quickQort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
        //if(end<high) quickQort(a,end+1,high);//右边序列。从关键值索引+1到最后一个
        System.out.println();
        System.out.print("快速排序：");
        for(int i = 0; i < a.length; i++) System.out.print(a[i] + ",");
    }

    //插入排序
    public static void insertSort(Integer[] array) {
        int temp = 0;
        for(int i = 1; i < array.length; i++) {
            for(int j = i; j > 0; j--) {
                if(array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else break;
            }
        }
        System.out.print("选择排序：");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ",");
    }

    //选择排序
    public static void selectSort(Integer[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) min = j;
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.print("选择排序：");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ",");
    }

    //冒泡排序
    public static void maoPao(Integer[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    index = array[i];
                    array[i] = array[j];
                    array[j] = index;
                }
            }
        }
        System.out.print("冒泡排序：");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ",");
    }

    //统计index在数组中的位置
    public static void countPosition(int index) {
        Integer[] array1 = {1, 2, 3, 4, 5, 3, 7, 8, 9, 0};
        int[] position = {};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == index) {
                position = Arrays.copyOf(position, position.length + 1);
                position[position.length - 1] = i;
            }
        }
        System.out.print("统计位置：");
        for (int i = 0; i < position.length; i++) System.out.print(position[i] + ",");
    }

    //合并数组并排序
    public static void mergeSort() {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] array3 = Arrays.copyOf(array1, array1.length * 2);
        for (int i = array1.length; i < array1.length * 2; i++) array3[i] = array2[i - array1.length];
        Arrays.sort(array3);
        System.out.print("合并并排序：");
        for (int i = 0; i < array3.length; i++) System.out.print(array3[i] + ",");
    }

    //数组扩容
    public static void expansionArray() {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] array3 = Arrays.copyOf(array1, array1.length * 2);
        for (int i = array1.length; i < array1.length * 2; i++) array3[i] = array2[i - array1.length];
        System.out.print("数组扩容：");
        for (int i = 0; i < array3.length; i++) System.out.print(array3[i] + ",");
    }

    //复制数组
    public static void copyArray() {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println("------复制数组------");
        //使用Arrays类的方法
        Integer[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.println(Arrays.toString(array2));

        //api提供的方法，底层用c++写的，所以速度很快，比for循环效率高
        Integer[] array3 = new Integer[array1.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.out.println(Arrays.toString(array3));

        //使用for，推荐使用，保证与原数组间的隔离性
        Integer[] array4 = new Integer[array1.length];
        for (int i = 0; i < array1.length; i++) array4[i] = array1[i];
        array4[0] = 4;
        System.out.println(array1[0]);
    }

}
