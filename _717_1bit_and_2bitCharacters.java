/**
 * Created by wanglifei on 2017/12/16.
 */
public class _717_1bit_and_2bitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; i++)
        {
            if (i == (bits.length -1)) return true;
            if (bits[i] == 1) i++;
        }
        return false;
    }
}
