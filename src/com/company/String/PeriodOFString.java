package com.company.String;

public class PeriodOFString {
    public static void main(String[] args) {
        String A="abcaabcaab";
       // char[]arr=A.toCharArray();
        //int rr=calculateZ(arr);
       //for(int i=0;i<rr.length;i++){
        // System.out.println(rr);
        //}

       int a= solve1(A);
      System.out.println(a);



    }
   /*public static int solve(String A) {
        for(int k=1;k<=A.length();k++){
            boolean flag=true;
            System.out.println(k);
            for(int i=0;i<A.length();i++){
                //similar
                System.out.println(A.charAt(i));
                System.out.println(A.charAt(i%k));
                if(A.charAt(i)!=A.charAt(i%k)){
                    System.out.println(A.charAt(i));
                    System.out.println(A.charAt(i%k));

                    flag=false;
                    break;
                }
            }
            if(flag){

                return k;
            }
        }
        return A.length();
    }

    */

    /*private static int calculateZ(char input[]) {
        int Z[] = new int[input.length];
        int left = 0;
        int right = 0;
        for(int k = 1; k < input.length; k++) {
            if(k > right) {
                left = right = k;
                while(right < input.length && input[right] == input[right - left]) {
                    right++;
                }
                Z[k] = right - left;
                right--;
            } else {
                //we are operating inside box
                int k1 = k - left;
                //if value does not stretches till right bound then just copy it.
                if(Z[k1] < right - k + 1) {
                    Z[k] = Z[k1];
                } else { //otherwise try to see if there are more matches.
                    left = k;
                    while(right < input.length && input[right] == input[right - left]) {
                        right++;
                    }
                    Z[k] = right - left;
                    right--;
                }
            }
        }
        int ans=Z.length;
        for (int i = 1; i < Z.length; i++) {

            if (i + Z[i] == Z.length) {
                ans=Z.length-Z[i];
                ans = Math.min(Z[i], ans);
                //System.out.println(Z[i]);
                break;
            }
        }
        return ans;
        //return Z;
    }

     */



    public static int solve1(String A) {
        //Z-Algo Solution-TC : O(n)
        int n = A.length();
        int[] z = new int[n];
       // z[0] = 0;
        //int count = 0;
        int start = 0;
        int end = 0;
        for (int i = 1; i < n; i++) {
           // count = 0;
            if (i > end) {
                start= i;
                end= i;
                //end = i;
                while (end < n && A.charAt(end) == A.charAt(end-start)) {
                    end++;
                    //count++;
                }
                z[i] = end-start;
                end--;
            } else {
                int j=i-start;
                if(z[j] < end - i + 1) {
                    z[i] = z[j];
                } else {
                    start=i;
                    while(end<n && A.charAt(end) == A.charAt(end-start)) {
                        end++;
                    }
                    z[i] = end - start;
                    end--;


                }
            }
        }

        //for (int i:z){
            //System.out.println("______________________________");
          //System.out.print(z[i]);

       // }
        int ans = n;

        for (int i = 1; i < n; i++) {

            if (i + z[i] == n) {
                ans=ans-z[i];
                ans = Math.min(z[i], ans);
                //System.out.println(z[i]);
                break;
            }
        }
        return ans;
    }
}
