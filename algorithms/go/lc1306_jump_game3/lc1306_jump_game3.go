package lc1306_jump_game3

var visited []bool

/*
1306. Jump Game III
https://leetcode.com/problems/jump-game-iii/
*/
func canReach(arr []int, start int) bool {
	visited = make([]bool, len(arr))
	return dp(arr, start)
}
func dp(nums []int, ind int) bool {
	if ind >= len(nums) || ind < 0 {
		return false
	} else if visited[ind] {
		return false
	} else if nums[ind] == 0 {
		return true
	} else {
		visited[ind] = true
		return dp(nums, ind+nums[ind]) || dp(nums, ind-nums[ind])
	}
}
