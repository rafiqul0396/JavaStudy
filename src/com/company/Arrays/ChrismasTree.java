package com.company.Arrays;

public class ChrismasTree {
    public static void main(String[] args) {


        int []A ={1, 6, 4, 2, 6, 9};
        int []B={2, 5, 7, 3, 2, 7};


        int mincost=calcuateCost(A,B);
        System.out.println(mincost);
    }

    private static int calcuateCost(int[] a, int[] b) {
        int n=a.length;
        int n2=b.length;
        int result=Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            int smaller=Integer.MAX_VALUE;
            int larger=Integer.MAX_VALUE;
            int curent_elemnt_cost=b[i];

            for(int j=i-1;j>=0;j--){
                if(a[i]>a[j]) {
                    int current = b[j];
                    smaller = Math.min(smaller, current);

                }

            }
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]) {
                    int current = b[j];
                    larger = Math.min(larger, current);
                }


            }
            if(smaller!=Integer.MAX_VALUE && larger!=Integer.MAX_VALUE){
                result=Math.min(result,smaller+larger+curent_elemnt_cost);
            }



        }



    return  result;
    }
}
