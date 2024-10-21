package cl55_jump_game

import "testing"

func TestCanJump(t *testing.T) {
	res := canJump([]int{2, 3, 1, 1, 4})
	if res != true {
		t.Fatalf(`canJump([]int{2,3,1,1,4}) = %v, want true`, res)
	}
	res = canJump([]int{3, 2, 1, 0, 4})
	if res != false {
		t.Fatalf(`canJump([]int{3,1,0,1,2}) = %v, want false`, res)
	}
	res = canJump([]int{0})
	if res != true {
		t.Fatalf(`canJump([]int{0}) = %v, want true`, res)
	}
}
