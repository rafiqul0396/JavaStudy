package com.company.Arrays;

public class MimSwap {
    public static void main(String[] args) {
        int []arr={52, 7,93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22};
        int b=19;
        int ans=minSwap(arr,b);
        System.out.println(ans);

    }

    private static int minSwap(int[] arr,int b) {
        int count=0;
        int n=arr.length;
        int i=0;
        int j=0;
        while(i<n && j<n){
            // if the arr
            if(arr[i]<=b){

                i++;
                j++;
            }
            else{
                while(j<n && arr[j]>b){
                    j++;
                }
                if(j>=n){
                    return count;
                }
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                count++;
                i++;
            }

        }
        return count;


    }
}
