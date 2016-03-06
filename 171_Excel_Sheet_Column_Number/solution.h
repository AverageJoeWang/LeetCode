#include <iostream>
#include<string>
using namespace std;



class Solution {
public:
    int titleToNumber(string s) {
        int temp = 0;
        int ret = 0;
        for(int i = 0; i < s.length(); ++i)
        {
            temp = s[i] - 'A' + 1;
            ret = ret * 26 + temp;
        }
        return ret;
    }
};
