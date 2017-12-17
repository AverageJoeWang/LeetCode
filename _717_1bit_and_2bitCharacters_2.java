/**
 * Created by wanglifei on 2017/12/17.
 */
public class _717_1bit_and_2bitCharacters_2 {
    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length - 1; i++)
        {
            if (bits[i] == 1)//从头开始遍历，当有1时候后面一个就直接修改成1，然后检查最后一个数字是否为0
            {
                bits[i+1] = 1;
                i++;
            }

        }
        return bits[bits.length - 1] == 0;
    }
}
