package com.example.demo;
import org.junit.jupiter.api.Test;

public class PalindromeTest{
    
    @Test
public void whenEmptyString_thenAccept() {
    Palindrome palindromeTester = new Palindrome();
    assertTrue(palindromeTester.isPalindrome(""));
}
}