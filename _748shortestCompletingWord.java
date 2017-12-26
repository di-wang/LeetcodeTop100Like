package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int len = 0;
        len = licensePlate.length();
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<len;i++ ){
            if ((int)licensePlate.charAt(i)>=97 && (int)licensePlate.charAt(i)<=122){
                list.add((int)licensePlate.charAt(i)-97);
            }

            if ((int)licensePlate.charAt(i)>=65 && (int)licensePlate.charAt(i)<=90){
                list.add((int)licensePlate.charAt(i)-65);
            }

        }
        System.out.println(list.toString());

        int min = 99999;
        String result = "";
        for ( int i = 0 ; i <words.length;i++){
            List<Integer> listcopy = new ArrayList<Integer>();
            List<Integer> list1 = new ArrayList<Integer>();
            System.out.println(words[i]);
            for (int j =0; j< words[i].length();j++){
                    System.out.println(j);
                    if ((int)words[i].charAt(j)>=97 && (int)words[i].charAt(j)<=122){
                        list1.add((int)words[i].charAt(j)-97);
                    }

                    if ((int)words[i].charAt(j)>=65 && (int)words[i].charAt(j)<=90){
                        list1.add((int)words[i].charAt(j)-65);
                    }
            }
            System.out.println(list1.toString());
            //compare list1 vs list
            boolean found = true;
            for (int x : list){
                if (!list1.contains(x)){
                    found = false;
                    break;
                }
                else {
                    list1.remove((Object) x);
                }


            }
            if (found == true){
            System.out.println("i am output from now");
            if (words[i].length()<min) {
                min = words[i].length();
                result = words[i];
            }
            }

        }


        return result;
    }



    public static void main(String[] args) {
	// write your code here
        String s  = "1s3 456";
        String[] group = {"looks","pest","stew","show"};
        String result  = shortestCompletingWord(s, group);
        System.out.println(result);
    }
}
