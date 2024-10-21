package cl45_jump_game2

/*
45. Jump Game II
https://leetcode.com/problems/jump-game-ii/description/
*/
func jump(nums []int) int {
	jumps := 0
	near := 0
	far := 0
	for far+1 < len(nums) {
		farthest := 0
		for i := near; i < far+1; i++ {
			farthest = max(farthest, nums[i]+i)
		}
		jumps++
		near = far + 1
		far = farthest
	}

	return jumps
}
