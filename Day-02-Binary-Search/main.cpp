#include <iostream>
#include <vector>
using namespace std;
int main() {
    int n;
     cout<<"Enter the size of array: ";
    cin >> n;
    vector<int> arr(n);
     cout<<"Enter elements of array in sorted order:\n";
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }
    int low = 0 ;
    int high = n-1;
    bool found = false;
    
    int target;
    cout<<"Enter your target: ";
    cin>>target;
    while(low <= high) {
        int mid = low + (high-low)/2;
   if(arr[mid] == target) {
       int index = -1;
    cout << "TARGET FOUND \n";
    index = mid;
    cout<<"The index is: " <<index;
   
    
    found = true;
    break;
}
else if(target < arr[mid]) {
    high = mid - 1;
}
else {
    low = mid + 1;
}
    }
   if(!found) {
       cout<<"-1";
   }
   return 0; 
} check this out