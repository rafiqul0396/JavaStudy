package com.company.sorting;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String input=sc.nextLine();
        String[] input1 = input.split("");

        int a = Integer.parseInt(input1[0]);
        int b = Integer.parseInt(input1[1]);
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); 

        int diff=Math.abs(a-b);
        int[] prefix =new int[n];
        prefix[0]=arr[0];
        for(int j=1;j<n;j++){
            prefix[j]=prefix[j-1]+arr[j];

        }
        int maxsum=prefix[n-1]-prefix[diff-1];
        int minsum=prefix[diff-1];
        int res=maxsum-minsum;
        System.out.println(res);


    }
}
