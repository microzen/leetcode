package lc670_maximum_swap

import "strconv"

func maximumSwap(num int) int {
	val := []byte(strconv.Itoa(num))
	last := make([]byte, len(val))
	copy(last, val)

	for i := 0; i < len(val); i++ {
		for j := i + 1; j < len(val); j++ {
			//todo: leetcode 670
		}
	}

	return num
}
