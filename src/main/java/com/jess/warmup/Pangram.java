package com.jess.warmup;

import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pangram {
    private static final Logger logger = LogManager.getLogger(ContainsDuplicate.class);

    private static boolean checkIfPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = Character.toLowerCase(sentence.charAt(i));
            if (Character.isLetter(c))
                alphabetSet.add(c);
        }
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args){
        logger.info("result: " + checkIfPangram("TheQuickBrownFoxJumpsOverTheLazyDog"));
    }
}
