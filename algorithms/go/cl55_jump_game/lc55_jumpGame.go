package cl55_jump_game

func canJump(nums []int) bool {
	size := len(nums)
	max := nums[0]
	for i := 0; i < size; i++ {
		if max < nums[i]+i {
			max = nums[i] + i
		} else if max >= size-1 {
			return true
		} else if max == i {
			return false
		}
	}
	return true
}
