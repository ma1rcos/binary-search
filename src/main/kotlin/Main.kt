package org.example

fun main() = runBlocking {
    val numbers = IntArray(100000) { it }
    val target = 99999
    val search = Search()
    val binarySearchJob = launch {
        search.executeBinary(numbers, target)
    }
    val linearSearchJob = launch {
        search.executeLinear(numbers, target)
    }
    binarySearchJob.join()
    linearSearchJob.join()
}