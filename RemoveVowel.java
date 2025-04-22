// Write the program to print the string to remove the vowel character

import java.util.*;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String remVowel = "";

        for(int i = 0 ; i < str.length(); i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='E'){
                continue;
            }else{
                remVowel += str.charAt(i);
            }
        }

        System.out.println("\nThe new String without vowels is : " + remVowel);

    }
}
