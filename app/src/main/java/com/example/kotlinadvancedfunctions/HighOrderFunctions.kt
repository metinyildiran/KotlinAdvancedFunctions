package com.example.kotlinadvancedfunctions

fun main() {
    val myNumList = listOf(1,5,8,2,6,0,4,3,9)

    // filter
    val smallNumberList = myNumList.filter {
        it < 6
    }

    printList(smallNumberList)

    // num
    val squaredNumbers = myNumList.map {
        it * it
    }

    printList(squaredNumbers)

    val filterAndMap = myNumList.filter {
        it < 6
    }.map {
        it * it
    }

    printList(filterAndMap)

    val musicians = listOf(
        Musician("James", 60),
        Musician("Lars", 55),
        Musician("Kirk", 50)
    )

    val filteredMusicians = musicians.filter {
        it.age < 60
    }.map {
        it.name
    }

    printList(filteredMusicians)
}

data class Musician(val name: String, val age: Int)

fun <T> printList(list: List<T>) {
    println()
    for (num in list){
        println(num)
    }
}
