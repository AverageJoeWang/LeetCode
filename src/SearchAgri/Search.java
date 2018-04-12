package SearchAgri;

/**
 * Created by oliverwang on 2018/4/10.
 */


public class Search {

    //二分查找、折半查找、前提是数组有序
    public int BinarySearch(int [] array, int n){
        int low = 0, high = array.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (array[mid] < n){
                low = mid + 1;
            }else if (array[mid] > n){
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }


}
