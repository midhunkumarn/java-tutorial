package problems;

import java.util.Scanner;

public class reverse {
        public static void main(String a[]){
            Scanner ch = new Scanner(System.in);
            System.out.println("Enter the String : ");
            String str = ch.nextLine();
            int len = str.length();

            char [] charArray = str.toCharArray();

            for(int i = 0, j = len -1; i<=j; i++, j--){
                char c = charArray[i];
                charArray[i]= charArray[j];
                charArray[j]=c;
            }
            String reversedString = new String(charArray);
            System.out.println(reversedString);
            
        }
    }
