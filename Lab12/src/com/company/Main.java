//Alen Alimkhanov (n01291955)
package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Character> maxList = new ArrayList<>();
        ArrayList<Character> currentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        for (int i = 0; i < s.length() - 1; i++) { //s.length()-1 для того чтобы не выходить за границы
            if (s.charAt(i) != ' ') {
                if(i + 1 == s.length() - 1 && s.charAt(i + 1) >= s.charAt(i)){
                    currentList.add(s.charAt(i));
                    currentList.add(s.charAt(i + 1));
                    if(currentList.size() > maxList.size()){
                        maxList.clear();
                        maxList.addAll(currentList);
                    }
                }
                else if(s.charAt(i) < s.charAt(i+1)){
                    currentList.add(s.charAt(i));
                    if(currentList.size() > maxList.size()){
                        maxList.clear();
                        maxList.addAll(currentList);
                    }
                }
                else{
                    currentList.add(s.charAt(i));
                    if(currentList.size() > maxList.size()){
                        maxList.clear();
                        maxList.addAll(currentList);
                    }
                    currentList.clear();
                }
            }
                else continue;
            }
            System.out.print("Maximum consecutive substring is ");
            for (Character ch : maxList) {
                System.out.print(ch);
            }
    }
}




