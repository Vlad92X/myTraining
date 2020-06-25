package com.kotlin.test

open data class Parent(private val name: String)

data class Child(private val name: String, private val age: Int) : Parent

fun main(args: Array<String>) {
    val listA = listOf<Int>(1, 2, 3)
    listA.add(4)
    println(listA)
}