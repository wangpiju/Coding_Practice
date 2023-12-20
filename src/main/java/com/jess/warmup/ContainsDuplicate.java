package com.jess.warmup;

import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContainsDuplicate {
    private static final Logger logger = LogManager.getLogger(ContainsDuplicate.class);

    private static boolean containsDuplicate(int[] nums){
        Set<Integer> s = new HashSet<>(10);

        for(int i: nums){
            if(s.contains(i)){
                return true;
            }
            s.add(i);
        }

        return false;
    }

    public static void main(String[] args){
        int[] samples = new int[]{1,2,3,4,6,5,6,7,8,9};
        logger.info("result: " + containsDuplicate(samples));
    }
}
