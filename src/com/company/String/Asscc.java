package com.company.String;

public class Asscc {
    public static void main(String[] args) {
        String str="nmnn";
        int a=solve(str);
        System.out.println(a);
        int val=(int)str.charAt(0);
        System.out.println(val);
    }



    public  static int solve(String A) {
        String odd="";
        String even="";
        int maxodd=Integer.MIN_VALUE;
        int minodd=Integer.MAX_VALUE;
        int maxeven=Integer.MIN_VALUE;
        int mineven=Integer.MAX_VALUE;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)%2==0){
                odd+=A.charAt(i);
                int val=(int)A.charAt(i);
                maxodd=Math.max(val,maxodd);
                minodd=Math.min(val,minodd);



            }else{
                even+=A.charAt(i);
                int val=(int)A.charAt(i);
                maxeven=Math.max(val,maxeven);
                mineven=Math.min(val,mineven);


            }
        }
       // if(odd.length()!=even.length()){
         //   return 0;
        //}
        if(maxodd != mineven + 1 && maxodd!=mineven-1){
            return 1;
        }

        else  if(maxeven != (mineven+1) && maxeven!=maxodd-1){
            return 1;
        }
        return 0;



    }


}
