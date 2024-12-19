package Leetcode_december;
public class december19 {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int sum =0;
        int c=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int actualSum = i*(i+1)/2;
            if(sum == actualSum)c++;
        }
        return c;
    }
}
