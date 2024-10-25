package org.example

import kotlinx.coroutines.*

class Search {

    fun executeBinary(numbers: IntArray, target: Int) {
        val timeInMillis = measureTimeMillis {
            var left = 0
            var right = numbers.size - 1

            while (left <= right) {
                val mid = (left + right) / 2
                if (numbers[mid] == target) {
                    println("Element found at position $mid")
                    return
                } else if (numbers[mid] < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
            println("Element not found")
        }
        println("Binary search execution time: ${timeInMillis / 1000.0} seconds")
    }

    fun executeLinear(numbers: IntArray, target: Int) {
        val timeInMillis = measureTimeMillis {
            for (i in numbers.indices) {
                if (numbers[i] == target) {
                    println("Element found at position $i")
                    return
                }
            }
            println("Element not found")
        }
        println("Linear search execution time: ${timeInMillis / 1000.0} seconds")
    }
}