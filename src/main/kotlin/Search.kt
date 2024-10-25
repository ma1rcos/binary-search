package org.example

import kotlinx.coroutines.*

class Search {

    fun executeBinary(numbers: IntArray, target: Int) {
        val timeInMillis = measureTimeMillis {
            // Implementação da busca binária
            var left = 0
            var right = numbers.size - 1

            while (left <= right) {
                val mid = (left + right) / 2
                if (numbers[mid] == target) {
                    println("Element found at position $mid")
                    return // Retorna após encontrar
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
            // Implementação da busca linear
            for (i in numbers.indices) {
                if (numbers[i] == target) {
                    println("Element found at position $i")
                    return // Retorna após encontrar
                }
            }
            println("Element not found")
        }
        println("Linear search execution time: ${timeInMillis / 1000.0} seconds")
    }
}