package cl55_jump_game

var visited []bool

func canJumpDP(nums []int) bool {
	visited = make([]bool, len(nums))
	return dp(nums, 0)
}
func dp(nums []int, ind int) bool {
	if ind > len(nums) {
		return false
	} else if ind == len(nums)-1 {
		return true
	} else {
		if visited[ind] {
			return false
		}
		visited[ind] = true
		num := nums[ind]
		for i := 0; i < num; i++ {
			if dp(nums, ind+i+1) {
				return true
			}
		}
		return false
	}
}
