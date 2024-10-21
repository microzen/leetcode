package lc962_maximum_width_ramp

/*
962. Maximum Width Ramp
https://leetcode.com/problems/maximum-width-ramp/description/?envType=daily-question&envId=2024-10-10
*/
func maxWidthRamp(nums []int) int {
	// i < j
	// nums[i] <= nums[j]
	// record minimum index, and i > minimun
	// return length - minimum index
	// FIXME: Time Limit Exceeded
	return bruteForce(nums)
}
func bruteForce(nums []int) int {
	result := 0
	minIndex := 0
	maxIndex := 0
	size := len(nums)
	for i := 0; i < size; i++ {
		if nums[minIndex] >= nums[i] {
			minIndex = i
			for j := maxIndex; j < size; j++ {
				if nums[j] >= nums[minIndex] {
					maxIndex = j
				}
			}
			result = max(result, maxIndex-minIndex)
		}
	}
	return result
}
