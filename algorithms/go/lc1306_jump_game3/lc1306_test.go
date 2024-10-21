package lc1306_jump_game3

import "testing"

func TestJumpGame(t *testing.T) {
	res := canReach([]int{4, 2, 3, 0, 3, 1, 2}, 5)
	if res != true {
		t.Fatalf("canReach([]int{4,2,3,0,3,1,2}, 5), wrong answer %v, want true", res)
	}
}
