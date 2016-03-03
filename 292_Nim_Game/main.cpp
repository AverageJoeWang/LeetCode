#include "solution.h"


int main()
{
    Solution s;
    bool n = s.canWinNim(1);
    if(n) cout << "You win" << endl;
    else cout << "Nim win" << endl;
    return 0;
}
