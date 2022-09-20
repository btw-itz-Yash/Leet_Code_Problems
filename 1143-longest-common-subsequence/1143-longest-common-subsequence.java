class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char []arr = text1.toCharArray();
        char []arr1 = text2.toCharArray();
        int temp[][]= new int [arr.length+1][arr1.length+1];
        int max = 0;
        for(int i=1;i<temp.length;i++){
            for(int j=1;j<temp[i].length;j++){
                if(arr[i-1]==arr1[j-1]){
                    temp[i][j]=temp[i-1][j-1]+1;
                }
                else{
                    temp[i][j]=Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j]>max){
                max= temp[i][j];
                }
            }
        }
        return max;      
    }
}