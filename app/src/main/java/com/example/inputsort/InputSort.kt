package com.example.inputsort

import java.util.*
import java.util.Scanner


class InputSort {

//    To get the input from USER:
//
//    / Output /
//    val writer = PrintWriter(BufferedOutputStream(System.out), true)
//
//    / Use either of these methods for input /

    /*
    // BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = br.readLine();                // Reading input from STDIN
    writer.println("Hi, " + name + ".");         // Writing output to STDOUT
    */

    // Scanner
//    val s = Scanner(System.`in`)
//    val name = s.nextLine() // Reading input from STDIN
//    writer.println("Hi, " + name + ".");         // Writing output to STDOUT


    fun main(args: Array<String>) {
        //creating Scanner object
        val read = Scanner(System.`in`)

        //Taking integer input
        println("Enter an integer number: ")
        var num1 = read.nextInt()

        //Taking float input
        println("Enter a float number: ")
        var num2 = read.nextFloat()

        //Displaying input numbers
        println("First Input Number: "+num1)
        println("Second Input Number: "+num2)
    }

}