import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        
        answer = new int[list.size()];
        for(int j=0; j<answer.length; j++){
            answer[j] = list.get(j);
        }

        return answer;
    }
}