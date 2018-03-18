/**
 * Created by oliverwang on 2018/3/18.
 */


public class JianZhiOffer23VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int length = sequence.length;
        if (length <= 0)
            return false;
        int root = sequence[length - 1];
        int i = 0;
        while (i < length - 1 && sequence[i++] < root);
        while (i < length - 1 && sequence[i++] > root);
        return i == length - 1;
    }
}
