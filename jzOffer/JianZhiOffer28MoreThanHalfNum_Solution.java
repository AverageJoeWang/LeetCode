/**
 * Created by oliverwang on 2018/3/20.
 */


public class JianZhiOffer28MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count=0, temp=0;
        for(int i=0;i<array.length;i++)
        {
            if(temp==array[i])count++;
            else if(count>0)
                count--;
            else {
                temp=array[i];
                count=1;
            }
        }
        count=0;
        for(int i=0;i<array.length;i++) {
            if(temp==array[i])
                count ++;
        }
        return count>array.length/2?temp:0;
    }
}
