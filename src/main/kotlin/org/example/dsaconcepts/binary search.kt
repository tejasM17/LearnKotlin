package org.example.dsaconcepts

fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val mid = left + (right - left) / 2

        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return -1
}

fun main() {
    binarySearch(intArrayOf(1,3,5,6), 2)
}