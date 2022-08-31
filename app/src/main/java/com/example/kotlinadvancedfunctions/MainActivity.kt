package com.example.kotlinadvancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val myInt: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val num = myInt + 1  Throws error

        myInt?.let {
            val num = it + 1
        }

        val myNum = myInt?.let {
            it + 1
        } ?: 0

        // also
        val metin = Person("Metin", 22)
        val atlas = Person("Atlas", 1)
        val zeynep = Person("Zeynep", 27)

        val people = listOf(metin, atlas, zeynep)

        people.filter {
            it.age > 18
        }.also {
            for (person in it){
                println(person.name)
            }
        }

        // apply
        val intent = Intent()
        intent.putExtra("", "")
        intent.putExtra("", "")
        intent.action = ""

        val intentWithApply = Intent().apply {
            putExtra("", "")
            putExtra("", "")
            action = ""
        }

        // with
        Person("barley", 4).apply {
            name = "Barley"
        }.also {
            println(it.name)
        }

        val newBarley = Person("bar", 4).apply {
            name = "Barley"
        }
        println(newBarley.name)

        val anotherBarley = with(Person("bar", 4)) {
            name = "Barley"
        }
        println(anotherBarley)

        val withBarley = Person("bar", 4)

        with(withBarley){
            name = "Barley"
        }

        println(withBarley.name)
    }
}

data class Person(var name: String, var age: Int)