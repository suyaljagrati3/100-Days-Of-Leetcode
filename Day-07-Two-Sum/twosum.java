
for(int i=0; i<n; i++) {
    for(int j=i+1; j<n; j++) {
        if(arr[i] + arr[j] == target) {
            System.out.println("Sum Found: " + arr[i] + " + " + arr[j]);
             System.out.println("Yes");
             return new int[]{i, j};
        }
    }
}
        return "No";
        return new int[]{-1, -1};
       
