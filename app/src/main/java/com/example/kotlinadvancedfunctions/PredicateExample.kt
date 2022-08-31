package com.example.kotlinadvancedfunctions

fun main(){
    val myNumList = listOf(1,5,8,2,6,0,4,3,9)

    val allCheck = myNumList.all {
        it > 5
    }
    println(allCheck)

    val anyCheck = myNumList.any {
        it > 5
    }
    println(anyCheck)

    val totalCount = myNumList.count {
        it > 5
    }
    println(totalCount)

    val findNum = myNumList.find {
        it > 5
    }
    println(findNum)

    val findLastNum = myNumList.findLast {
        it > 5
    }
    println(findLastNum)

    val myPredicate = {num: Int -> num > 5}
    val findLastNumPredicate = myNumList.findLast(myPredicate)
    println(findLastNumPredicate)
}
