package com.example.dsausingkotlin.pattern

import java.util.*

/**
 * @Author: Archana Kumari
 * @Date: 24-12-2022
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter terms:")
    println()
    var terms: Int = scanner.nextInt()
    scanner.close()
    var count = 1;
    for (i in 0..terms - 1) {
        for (j in 0..i) {
            print(count)
            print(" ")
            count++;
        }
        println()
    }
}
