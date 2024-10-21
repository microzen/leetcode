package cl32_longest_vaild_parentheses

import "testing"

func TestLongestValidParentheses(t *testing.T) {
	res := longestValidParentheses(")()())()()(")
	if res != 4 {
		t.Fatalf(`longestValidParentheses(")()())()()(") = %v, want 4`, res)
	}

	res = longestValidParentheses("((()((()()()()")
	if res != 8 {
		t.Fatalf(`longestValidParentheses("((()((()()()()") = %v, want 8`, res)
	}
	res = longestValidParentheses("((()((()()()()(()()()(((()()()()())))())")
	if res != 34 {
		t.Fatalf(`longestValidParentheses("((()((()()()()(()()()(((()()()()())))())") = %v, want 34`, res)
	}
	res = longestValidParentheses("")
	if res != 0 {
		t.Fatalf(`longestValidParentheses("(()") = %v, want 0`, res)
	}
	res = longestValidParentheses("()(()")
	if res != 2 {
		t.Fatalf(`longestValidParentheses("(()") = %v, want 2`, res)
	}
	res = longestValidParentheses(")(")
	if res != 0 {
		t.Fatalf(`longestValidParentheses(")(") = %v, want 0`, res)
	}
}
