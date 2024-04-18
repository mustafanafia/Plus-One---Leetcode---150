class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i=n-1; i>=0; i--){

            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i]++;
                return digits;
            }

        }
        int[] new_arr = new int[n+1];
        new_arr[0] = 1;
        return new_arr;

    }
}