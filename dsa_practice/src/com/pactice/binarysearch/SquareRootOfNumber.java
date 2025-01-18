package com.pactice.binarysearch;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        int x= 5;
        int sqrtOfNumber= getSquareRootOfNumber(x);
        System.out.println(sqrtOfNumber);
    }

    private static int getSquareRootOfNumber(int x) {
        int low=1;
        int high=x;
        int ans =-1;

        while (low<=high){
            int mid=(low+high)/2;

            int sqrt = mid * mid;
            if(sqrt == x){
                return mid;
            } else if(sqrt > x){
                high=mid-1;
            } else {
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
