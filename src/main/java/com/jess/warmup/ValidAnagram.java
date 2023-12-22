package com.jess.warmup;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidAnagram {
    private static final Logger logger = LogManager.getLogger(ValidAnagram.class);

    public static void main(String[] args){
        logger.info(isAnagram( "listen","silent"));
        logger.info(isAnagram( "hello", "world"));
        logger.info(isAnagram( "anagram","nagaram"));
        logger.info(isAnagram( "rat","car"));
    }
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            Character c  = Character.valueOf(s.charAt(i));

            if(null == map.get(c)){
                map.put(c, 1);
            }
            else{
                Integer count = map.get(c);
                count++;
                map.put(c, count);
            }
        }

        for(int i = 0; i< t.length(); i++){
            Character c  = Character.valueOf(t.charAt(i));

            if(null == map.get(c)){
                return false;
            }
            else{
                Integer count = map.get(c);
                if(count == 0){
                    return false;
                }
                map.put(c, count-1);
            }
        }

        return true;
    }
}
