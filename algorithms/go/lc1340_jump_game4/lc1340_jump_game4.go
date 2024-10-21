package lc1340_jump_game4

var visited []int

/*
1340. Jump Game V
https://leetcode.com/problems/jump-game-v/
*/
func maxJumps(arr []int, d int) int {
	res := 0
	visited = make([]int, len(arr))
	for i := 0; i < len(visited); i++ {
		visited[i] = -1
	}
	for i, _ := range arr {
		dp(arr, d, i)
	}
	for _, item := range visited {
		res = max(res, item)
	}
	return res + 1
}
func dp(arr []int, d int, ind int) int {
	if visited[ind] == -1 {
		visited[ind] = 0
		left := ind - d
		right := ind + d

		result := 0
		// right
		for i := ind + 1; i <= right && i < len(arr); i++ {
			if arr[i] < arr[ind] {
				result = max(result, 1+dp(arr, d, i))
			} else {
				break
			}
		}
		// left
		for i := ind - 1; left <= i && i >= 0; i-- {
			if arr[i] < arr[ind] {
				result = max(result, 1+dp(arr, d, i))
			} else {
				break
			}
		}
		visited[ind] = result
	}
	return visited[ind]
}
