import java.util.ArrayList;

/**
 * Created by oliverwang on 2018/3/26.
 */


public class JianZhiOffer41FindContinuousSequence {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        if(sum < 3) return lists;
        int small = 1;
        int big = 2;
        int curSum = small + big;
        //设置middle变量的原因在于如果在当前总和小于sum的情况下，
        //small在增加到sum的一半的过程中肯定会大于sum
        int middle = (1 + sum) / 2;
        while(small < middle){
            ArrayList<Integer> sq = new ArrayList<Integer>();
            if(curSum == sum){
                for (int i = small; i <= big; i++) {
                    sq.add(i);
                }
            }
            while(curSum > sum && small < middle){
                curSum -= small;
                small++;
                if(curSum == sum){
                    for (int i = small; i <= big; i++) {
                        sq.add(i);
                    }
                }
            }
            if(sq.size() > 0) lists.add(sq);;
            big++;
            curSum += big;
        }

        return lists;
    }
}
