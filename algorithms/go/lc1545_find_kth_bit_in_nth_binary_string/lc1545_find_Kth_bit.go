package lc1545_find_kth_bit_in_nth_binary_string

import "math"

func findKthBit(n int, k int) byte {
	index := n
	result := false
	for {
		pow := int(math.Pow(2, float64(index)))
		if k == 1 {
			break
		} else if k == pow {
			result = !result
			break
		} else if k > pow {
			k = pow - (k - pow)
			result = !result
			continue
		} else {
			index--
		}
	}
	if result {
		return '1'
	} else {
		return '0'
	}
}
