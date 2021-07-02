package com.company.leecode.q771;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：Tony.L
 * @version ：2019 Version：1.0
 * @create ：2019/04/28 11:11
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0, len = S.length(); i < len; i++) {
            if (J.contains(String.valueOf(S.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    public int numJewelsInStones1(String J, String S) {
        int count = 0;
        Set set = new HashSet();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }

        for (int i = 0, len = S.length(); i < len; i++) {
            if (set.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numJewelsInStones("z", "ZZZ"));
    }
}
