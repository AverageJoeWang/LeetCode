#include "solution.h"

int main()
{
    Solution s;
    vector<int> nums = {0,1,0,3,12};
    s.moveZeroes(nums);
    for(int i = 0; i < nums.size(); i++)
        cout <<" "<< nums[i];
    return 0;
}
