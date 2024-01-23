class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(s.toLowerCase()).reverse().toString();
        return s.toLowerCase().equals(reversed);
    }
}