class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // array 자르기
        for(int i=0; i<commands.length; i++) {
            int si = commands[i][0];
            int ei = commands[i][1];
            int ni = commands[i][2];
            int[] tempArr = new int[ei-si+1];
            for(int j=0; j<ei-si+1; j++){
                tempArr[j] = array[j+si-1];
            }
            //정렬하기
            for(int l=0; l<tempArr.length; l++) {
                for(int k=0; k<tempArr.length-l-1; k++) {
                    if(tempArr[k]>tempArr[k+1]) {
                        int temp = tempArr[k];
                        tempArr[k] = tempArr[k+1];
                        tempArr[k+1] = temp;
                    }
                }
            }
            
            int num = tempArr[ni-1];
            answer[i] = num;
        }
        return answer;
    }
}