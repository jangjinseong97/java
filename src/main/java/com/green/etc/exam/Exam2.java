package com.green.etc.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam2 {
    /*
    int[] 의 배열에서 중복을 제외한 값 절반 뽑기

    nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.

    nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.

    폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.

    가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도,
    선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.

     */
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = new int[]{1, 2, 2, 3, 4, 4};
        int[] a1 = new int[]{1, 2, 7, 3, 4, 4};
        int[] a2 = new int[]{1, 1, 1, 4, 4, 4};
        System.out.println(sol.solution(a2));
    }
}

class Solution {
    public int solution(int[] nums) {
        int len = nums.length;
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        a:
        for(int i=0;i<len;i++){
            for (int n=0;n<temp.size();n++) {
                if (temp.get(n) == nums[i]) {
                    continue a; // 중복이라면 돌아가도록
                }
            }
            temp.add(nums[i]); // 위의 if문을 나왓으므로 추가
            if(temp.size()==len/2){
                break ;
            }
        }
        System.out.println(temp);
        int answer = temp.size();
        return answer;
    }
}