package cl32_longest_vaild_parentheses

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}
func longestValidParentheses(s string) int {
	stack := []int{-1}
	result := 0
	for i, ch := range s {
		if ch == '(' {
			stack = append(stack, i)
		} else {
			stack = stack[:len(stack)-1]
			if len(stack) == 0 {
				stack = append(stack, i)
			} else {
				result = max(i-stack[len(stack)-1], result)
			}
		}
	}
	return result
}
