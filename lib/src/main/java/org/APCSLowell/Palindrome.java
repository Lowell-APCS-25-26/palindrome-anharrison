package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        if (s == null) return true;
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String norm = cleaned.toString();
        return norm.equals(new StringBuilder(norm).reverse().toString());
    }
    public String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }
}
