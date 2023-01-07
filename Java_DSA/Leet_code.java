class Solution {
    public static String reformatNumber(String number) {
        String num1 = number.replace(" ","");
        String num2 = num1.replace("-","");
        String res = " ";


        return num2;
    }

    public static boolean validPalindrome(String s) {
        int a = 0;
        int b = s.length()-1;

        while(a<b){
            if(s.charAt(a) != s.charAt(b)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sol = reformatNumber("545- 0");
        System.out.println(sol);
        //boolean res = validPalindrome("racecar");
        //System.out.println(res);
    }
} 