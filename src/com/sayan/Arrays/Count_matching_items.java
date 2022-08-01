package com.sayan.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Count_matching_items {
    public static void main(String[] args) {
        List<List<String>> arr = Arrays.asList(Arrays.asList("phone","blue","pixel"),Arrays.asList("computer","silver","lenovo"),Arrays.asList("phone","gold","iphone"));
        System.out.println(countMatches(arr,"color","silver"));
        System.out.println(countMatches(arr,"type","phone"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int i=0;
        if(ruleKey.equals("color"))
            i=1;
        else if(ruleKey.equals("name"))
            i=2;
        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue))
                count++;
        }
        return count;
    }
}
