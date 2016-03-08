#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;


//第一种解法，有排序部分
//class Solution {
//public:
//    int majorityElement(vector<int>& nums) {
//        int n = nums.size();
//        if(n == 1) return nums[0];
//        sort(nums.begin(), nums.end());
//        int count = 1;
//        for(int i = 1; i < n; i++)
//        {
//            if(nums[i - 1] ^ nums[i] == 0) count++;
//            else count = 1;
//            
//            if(count > (n/2)) return nums[i];
//        }
//    }
//};


//第二种解法，无排序解法，更加优化
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        int count = 1, temp = nums[0];
        for(int i = 1; i < n; i++)
        {
            if(nums[i] == temp) count++;
            else count--;
            
            if(count == 0) temp = nums[i + 1];
        }
        return temp;
    }
};
