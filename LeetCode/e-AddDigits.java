class Solution {
    public int addDigits(int num) {
       while(num > 9){
            int temp = 0;
            while(num / 10 > 0){
                temp += num % 10;
                num = num/10;
            }
            num = temp + num;
        }
        return num;
    }
}
