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

    for (i in 1..terms) {
        for(space in 1..terms - i){
            print(" ")
        }
        for (j in 1..2*i-1) {
            print(i)
        }
        println()
    }
}