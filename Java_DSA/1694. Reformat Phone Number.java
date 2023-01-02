class Solution {
    public static String reformatNumber(String number) {
        String num1 = number.replace(" ","");
        String num2 = num1.replace("-","");
        String res = " ";


        return num2;
    }
    public static void main(String[] args) {
        String sol = reformatNumber("545- 0");
        System.out.println(sol);
    }
} 