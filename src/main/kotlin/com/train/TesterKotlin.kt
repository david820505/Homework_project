package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("How many number of ticket do you need?")
    var tik_num = scanner.nextInt()
    println("How many they are round ticket?")
    var rod_num = scanner.nextInt()

    val t = Ticket2(tik_num,rod_num)
    val result = t.total()
    println("Total tickets:$tik_num")
    println("Round-trip:$rod_num")
    println("Total amount of ticket is$result")

}

class Ticket2(var tik_num: Int , var rod_num: Int){
    fun total() :Int{
        val toatl = (tik_num-rod_num)*1000 + rod_num * 1800
        return toatl
    }
}