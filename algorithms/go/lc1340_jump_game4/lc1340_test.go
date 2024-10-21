package lc1340_jump_game4

import "testing"

func TestJumpGame(t *testing.T) {
	res := maxJumps([]int{6, 4, 14, 6, 8, 13, 9, 7, 10, 6, 12}, 2)
	if res != 4 {
		t.Fatalf("want=4, got=%d", res)
	}
	res = maxJumps([]int{96, 74, 85, 13, 38, 79, 17, 42, 41, 33, 29, 7, 20, 28, 16, 67, 16, 33, 83, 1, 19, 69, 95, 98, 68, 11, 65, 74, 98, 97, 40, 83, 64, 91, 92, 4, 8, 50, 43, 31, 58, 100, 86, 84, 36, 72, 60, 92, 63, 76, 99, 46, 85, 45, 28, 48, 66, 72, 60, 75, 37, 48, 21, 16, 33, 24, 34, 23, 37, 8, 31, 67, 16, 93, 75, 9, 80, 4, 56, 30, 40, 31, 40, 57, 96, 61, 42, 79, 62, 25, 76, 58, 4, 57, 95, 58, 28, 23, 71, 57, 73, 64, 38, 93, 24, 78, 59, 9, 9, 47, 84, 60, 59, 40, 53, 28, 77, 91, 93, 9, 72, 61, 16, 45, 70, 90, 50, 89, 22, 63, 82, 42, 47, 11, 51, 16, 31, 11, 9, 77, 86, 27, 56, 16, 59, 13, 70, 48, 46, 45, 84, 26, 57, 99, 60, 97, 84, 8, 67, 98, 30, 29, 55, 69, 87, 17, 82, 47, 63, 56, 29, 37, 4, 90, 56, 39, 58, 9, 34, 6, 87, 21, 38, 70, 31, 1, 89, 74, 12, 68, 76, 35, 17, 19, 30, 100, 66, 84, 32, 41, 2, 18, 46, 72, 48, 2, 53, 19, 13, 8, 68, 3, 35, 74, 5, 19, 100, 91, 41, 25, 27, 66, 98, 22, 37, 100, 5, 36, 43, 9, 29, 84, 88, 11, 44, 54, 13, 87, 86, 77, 36, 6, 86, 72, 26, 1, 81, 2, 4, 31, 63, 3, 19, 81, 58, 63, 1, 9, 92, 2, 44, 17, 100, 54, 32, 72, 84, 30, 10, 95, 79, 62, 10, 49, 53, 53, 71, 39, 34, 50, 53, 64, 11, 39, 41, 17, 80, 63, 51, 73, 86, 5, 60, 35, 57, 35, 23, 26, 100, 4, 43, 41, 86, 13, 79, 62, 70, 49, 41, 97, 85, 30, 5, 69, 26, 70, 86, 17, 83, 67, 82, 9, 63, 70, 81, 14, 46, 72, 48, 22, 51, 2, 11, 83, 75, 73, 51, 99, 40, 29, 56, 65, 67, 25, 24, 85, 48, 25, 91, 70, 71, 2, 49, 33, 54, 72, 24, 23, 2, 84, 99, 23, 72, 27, 1, 35, 56, 100, 29, 41, 77, 7, 61, 30, 5, 65, 9, 40, 87, 78, 78, 44, 99, 53, 47, 72, 20, 14, 91, 72, 14, 83, 38, 44, 51, 55, 90, 46, 83, 89, 69, 71, 96, 24, 84, 49, 95, 43, 48, 95, 9, 64, 58, 44, 50, 56, 42, 7, 84, 14, 62, 18, 37, 42, 86, 71, 12, 76, 62, 26, 52, 2, 40, 57, 62, 31, 100, 99, 21, 19, 75, 47, 9, 79, 19, 76, 24, 24, 33, 49, 77, 52, 72, 99, 43, 87, 66, 65, 88, 58, 32, 74, 100, 58, 33, 44, 29, 37, 56, 86, 3, 75, 52, 35, 86, 74, 20, 53, 69, 94, 82, 49, 52, 69, 83, 92, 44, 95, 14, 77, 39, 91, 62, 12, 41, 97, 76, 66, 56, 6, 12, 45, 88, 36, 42, 82, 90, 97, 2, 94, 49, 64, 66, 30, 34, 36, 51, 44, 77, 32, 50, 12, 82, 80, 90, 91, 37, 98, 30, 2, 30, 93, 18, 81, 40, 32, 37, 69, 82, 92, 97, 55, 97, 39, 11, 52, 45, 21, 31, 16, 23, 68, 28, 54, 77, 35, 39, 93, 98, 32, 29, 45, 53, 34, 93, 18, 10, 22, 35, 11, 11, 81, 14, 38, 83, 33, 1, 43, 55, 44, 77, 15, 92, 49, 49, 25, 88, 51, 53, 72, 2, 99, 4, 86, 4, 76, 40, 77, 46, 26, 33, 94, 17, 53, 40, 23, 58, 19, 96, 62, 66, 80, 15, 74, 7, 35, 64, 92, 89, 19, 45, 77, 78, 71, 92, 45, 37, 12, 94, 14, 47, 76, 5, 1, 20, 36, 9, 45, 40, 18, 46, 91, 40, 61, 14, 59, 61, 40, 90, 74, 2, 42, 47, 64, 35, 18, 37, 37, 75, 63, 85, 50, 6, 14, 94, 30, 81, 61, 78, 58, 17, 66, 20, 4, 78, 82, 28, 70, 45, 6, 69, 99, 13, 79, 26, 93, 53, 62, 31, 82, 25, 37, 2, 4, 71, 48, 49, 82, 10, 23, 96, 54, 43, 67, 53, 69, 59, 22, 51, 80, 24, 75, 43, 40, 23, 10, 52, 73, 84, 46, 75, 61, 61, 39, 27, 13, 52, 20, 38, 82, 67, 35, 87, 48, 49, 7, 99, 91, 98, 20, 93, 28, 34, 77, 54, 23, 64, 12, 34, 35, 69, 41, 99, 88, 4, 5, 12, 53, 20, 44, 99, 31, 71, 90, 86, 65, 76, 47, 74, 16, 92, 94, 57, 53, 81, 13, 7, 30, 30, 29, 63, 14, 74, 38, 94, 62, 6, 5, 69, 14, 85, 40, 4, 36, 27, 33, 40, 86, 9, 53, 53, 88, 56, 3, 47, 49, 55, 22, 57, 12, 32, 93, 40, 23, 95, 74, 92, 23, 51, 33, 54, 25, 91, 85, 62, 15, 73, 95, 19, 85, 16, 3, 54, 77, 64, 60, 21, 92, 98}, 615)
	if res != 15 {
		t.Fatalf("want=15, got=%d", res)
	}
}
