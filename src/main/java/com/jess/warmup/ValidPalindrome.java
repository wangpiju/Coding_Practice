package com.jess.warmup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidPalindrome {

    private static final Logger logger = LogManager.getLogger(ValidPalindrome.class);

    public static void main(String[] args) {
        String sampleTrue = "Was it a car or a cat I saw?";
        String sampleFalse = "Was it a car or a  I saw?";

        logger.info("sampleTrue: " + isPalindrome(sampleTrue));
        logger.info("sampleFalse: " + isPalindrome(sampleFalse));


    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1; // initialize two pointers, one at the start and one at the end of the string
        while (i < j) { // continue until the two pointers cross over
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) { // move i forward until a letter or digit is found
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) { // move j backward until a letter or digit is found
                j--;
            }

            // compare the characters at i and j after converting them to lowercase
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false; // if they are not equal, the string is not a palindrome
            i++; // move i forward
            j--; // move j backwards
        }

        return true; // if the two pointers have crossed over, the string is a palindrome
    }
}
