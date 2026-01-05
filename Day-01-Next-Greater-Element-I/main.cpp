#include <iostream>
#include <vector>
using namespace std;

vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
    vector<int> ans;
    for(int i=0; i<nums1.size(); i++){
        int foundIndex = -1;
        for(int j=0; j<nums2.size(); j++){
            if(nums1[i]==nums2[j]){
                foundIndex=j;
                break;
            }
        }
        int next = -1;
        for(int k=foundIndex+1; k<nums2.size(); k++){
            if(nums2[k]>nums2[foundIndex]){
                next=nums2[k];
                break;
            }
        }
        ans.push_back(next);
    }
    return ans;
}

int main() {
    vector<int> nums1 = {4,1,2};
    vector<int> nums2 = {1,3,4,2};
    vector<int> res = nextGreaterElement(nums1, nums2);
    for(int val : res) cout << val << " ";
    return 0;
}
