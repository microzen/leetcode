package cl45_jump_game2

import "testing"

func TestJump(t *testing.T) {
	res := jump([]int{2, 3, 1, 1, 4})
	if res != 2 {
		t.Fatalf("jump([]int{2, 3, 1, 1, 4}) ,Expected 2, got %d", res)
	}
	res = jump([]int{2, 3, 0, 1, 4})
	if res != 2 {
		t.Fatalf("jump([]int{2, 3, 0, 1, 4}) ,Expected 2, got %d", res)
	}
	res = jump([]int{2, 3, 1, 1, 4, 3, 5, 3, 1, 1, 1, 1, 31, 1, 1, 1, 1, 1, 1})
	if res != 6 {
		t.Fatalf("jump([]int{2, 3, 1, 1, 4, 3, 5, 3, 1, 1, 1, 2, 31, 1, 1, 1, 1, 1, 1}) ,Expected 6, got %d", res)
	}
	res = jump([]int{0})
	if res != 0 {
		t.Fatalf("jump([]int{2, 3, 1, 1, 4, 3, 5, 3, 1, 1, 1, 2, 31, 1, 1, 1, 1, 1, 1}) ,Expected 0, got %d", res)
	}

}
