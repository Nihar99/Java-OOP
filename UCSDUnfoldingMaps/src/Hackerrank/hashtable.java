package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class hashtable {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        //Brute Force 
        // for(int i=0;i<cost.length-1;i++)
        // {
        //     if(cost[i]<money)
        //     {
        //         for(int j=i+1;j<cost.length;j++)
        //         {
        //             if(cost[j]==money-cost[i]){

        //                 result.add(i);
        //                 result.add(j);
        //             }
        //         }
        //     }
        // }                                                                           
        //Binary Search
         for(int i=0;i<cost.length-1;i++)
        {
            if(cost[i]<money)
            {
                int low = i+1;
                int j = cost.length - 1;
                int m = (low+j)/2;
                while(low<=j)
                {
                    if(money-cost[i]<m)
                        j = m - 1;
                    else if(money - cost[i]>m)
                        low = m + 1;
                    else
                        {
                            result.add(i);
                            result.add(m);
                            break;
                        }
                }
            }
        } 
        int ans = result.get(0) + 1;
        int ans1 = result.get(1) + 1;
        System.out.println(ans +" "+ ans1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
