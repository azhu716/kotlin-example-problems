/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */
package palindrome

fun isPalindrome(s: String): Boolean {
    var start = 0
    var end = s.length - 1
	while(start < end) {
		if(s[start] != s[end]) return false
		start++
		end--
	}
	return true
}

