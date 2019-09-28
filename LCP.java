/*package whatever //do not write package name here */

 

import java.util.*;

import java.lang.*;

import java.io.*;

 

class GFG {

    /*public static String findLCP(String[] strs, int n){

        String prefix=strs[0];

        int size=prefix.length();

        for(int i=1;i<n;i++){

            while(strs[i].length()<size || !strs[i].substring(0,size).equals(prefix)){

                prefix=prefix.substring(0,size-1);

                size--;

                //i=1;

                //System.out.println("i "+i+" prefix "+prefix+" size "+size);

                //continue;

            }

        }

        if(size<1)

            return "-1";

        else

            return prefix;

    }*/

    /*public static int findMinStr(String[] strs){

        int min=Integer.MAX_VALUE;

        for(int i=0;i<strs.length;i++){

            if(strs[i].length()<min)

                min=strs[i].length();

        }

        return min;

    }

    public static String findLCP(String[] strs, int n){

        int min=findMinStr(strs);

        String result=new String("-1");

        for(int i=0;i<min;i++){

            char c=strs[0].charAt(i);

            for(int j=0;j<strs.length;j++){

                if(strs[j].charAt(i)!=c)

                    return result;

            }

            if(result.equals("-1"))

                result="";

                result+=c;

        }

        return result;

    }*/

    public static String DnC_LCP(String s1, String s2){

        //String prefix=s1;

        int size=s1.length();

        while(s1.length()<s2.length() || !s1.substring(0,size).equals(s1)){

                s1=s1.substring(0,size-1);

                size--;

            }

        return s1;

    }

    public static String findLCP(String[] strs,int low, int high){

        if (low == high)

        return (strs[low]);

  

    if (high > low)

    {

        int mid = low + (high - low) / 2;

  

        String str1 = findLCP(strs, low, mid);

        String str2 = findLCP(strs, mid+1, high);

  

        return (DnC_LCP(str1, str2));

    }

    return "";

    }

              public static void main (String[] args) {

                             //code

                             int T;

                             Scanner sc=new Scanner(System.in);

                             T=sc.nextInt();

                             while(T>0){

                                 int n=sc.nextInt();

                                 String[] strs=new String[n];

                                 for(int i=0;i<n;i++)

                                     strs[i]=sc.next();

                                 String result=findLCP(strs,0,strs.length-1);

                                 System.out.println(result);

                                 T--;

                             }

              }

}