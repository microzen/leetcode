package lc_2696_minmum_string_lenght_after_removing_substrings

func minLength(s string) int {
	stack := make([]rune, len(s))
	ind := 0
	for i := 0; i < len(s); i++ {
		if ind == 0 {
			stack[ind] = rune(s[i])
			ind++
		} else if s[i] == 'B' && stack[ind-1] == 'A' {
			ind--
		} else if s[i] == 'D' && stack[ind-1] == 'C' {
			ind--
		} else {
			stack[ind] = rune(s[i])
			ind++
		}
	}
	return ind
}
