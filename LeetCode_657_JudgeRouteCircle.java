/**
 * Created by wanglifei on 2018/1/5.
 */
public class LeetCode_657_JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        char [] movesArr = moves.toCharArray();
        for (int i = 0; i < movesArr.length; i++)
        {
            if (movesArr[i] == 'L') x--;
            else if (movesArr[i] == 'R') x++;
            else if (movesArr[i] == 'U') y++;
            else y--;
        }
        return x == 0 && y == 0;
    }
}
