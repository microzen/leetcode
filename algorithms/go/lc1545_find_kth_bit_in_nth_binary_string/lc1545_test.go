package lc1545_find_kth_bit_in_nth_binary_string

import "testing"

func TestFindKthBit(t *testing.T) {
	n, k := 20, 30
	if findKthBit(n, k) != '0' {
		t.Fatalf("fatal n, k = 20, 30")
	}
	n, k = 4, 7
	if findKthBit(n, k) != '1' {
		t.Fatalf("fatal n, k = 4, 7")
	}
}
