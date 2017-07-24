package data_structure;

/**
 * 二分查找法
 */
public class ErFenFa {
    public static void main(String[] args) {
        Integer[] in = {1,3,4,5,6,7,9};
        System.out.println(erFenFa(in, 4));
    }

    //二分法查找
    public static int erFenFa(Integer[] in, int key) {
        int start = 0;
        int end = in.length - 1;
        while (start <= end) {
            int middle = (end + start)/2;
            if(key < in[middle]) {
                end = middle - 1;
            } else if (key > in[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
