package Leetcode_december;

import java.util.Stack;

public class december18 {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s = new Stack<>();
        int n= prices.length;
        int nse[]= new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()>prices[i]) s.pop();

            nse[i] =s.isEmpty() ? 0:s.peek();

            s.push(prices[i]);
        }
        for(int i=0;i<prices.length;i++){
            System.out.println(nse[i]);
        }
        for(int i=0;i<prices.length;i++){
            nse[i] = prices[i]-nse[i];
        }
        return nse;
    }
}
