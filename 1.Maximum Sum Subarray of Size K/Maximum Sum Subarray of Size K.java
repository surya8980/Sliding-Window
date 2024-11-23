class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int sum=0;
        int windowsum=0;
        int start=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
           sum+=arr[i];
           if(i-start+1==k){
               windowsum=Math.max(windowsum,sum);
               sum-=arr[start];
               start++;
           }
           
        }
        return windowsum;
    }
}
