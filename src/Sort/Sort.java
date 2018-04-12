package Sort;

/**
 * Created by oliverwang on 2018/4/10.
 */


public class Sort {
    //选择排序，n^2
    public void SelectSort(int []a){
        int temp;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    //冒泡排序，n^2
    public void BubbleSort(int []a){
        int temp;
        for (int i = 0; i < a.length; i++){
            for (int j = 1; j < a.length - i; j++){
                if (a[j - 1] > a[j]){
                    temp = a[j -1];
                    a[j -1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    //快排序，O(nlogn)
    public void QuickSort(int []a, int _left, int _right){
        int left = _left, right = _right, privot;
        if (left < right){
            privot = a[left];
            while (left != right){
                while (right > left && a[right] >= privot) right--;//从右往左找到比基准线小的数
                a[left] = a[right];//将右边比基准线小的数和基准线互换
                while (right > left && a[left] <= privot) left++;//从左往右找比基准线大的数
                a[right] = a[left];//将左边比基准线大的数字换到右边
            }
            //此时left和right指向同一个位置
            a[left] = privot;//将基准线数字归位
            QuickSort(a, _left, left - 1);//分治
            QuickSort(a,left + 1, _right);//分治
        }
    }


}
