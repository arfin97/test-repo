class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String sy) {
        sy = sy.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(sy.toLowerCase()).reverse().toString();
        return sy.toLowerCase().equals(reversed);
    }
}