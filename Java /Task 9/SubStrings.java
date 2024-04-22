package com.company.wiproPracticeQuestion;

//Write a method that takes two strings, concatenates them, reverses the result, and then extracts the middle substring
// of the given length. Ensure your method handles edge cases, such as an empty string or a
// substring length larger than the concatenated string.

public class SubStrings {
    public static String getSubstring(String str1, String str2, int length) {

        String add = str1 + str2;


        if (add.isEmpty() || length > add.length()) {
            return null;
        }


        StringBuilder reverseString = new StringBuilder(add).reverse();
//        for (int i = add.length(); i > 0 ; --i) {
//            char reverse = add.charAt(i-1);
//        }


        int startIndex = (reverseString.length() - length) / 2;


        String middleSubstring = reverseString.substring(startIndex, startIndex + length);

        return middleSubstring;
    }

    public static void main(String[] args) {

        String ex = "Wipro";
        String ex2 = "Training";
        int l = 5;
        String middleSubstring = getSubstring(ex, ex2, l);
        System.out.println("Middle Substring: " + middleSubstring);
    }
}

