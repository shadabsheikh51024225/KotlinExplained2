package com.example.kotlinexplained

/**
 * Elvis Operator(?:) –
The Elvis operator is used to return a non-null value or a default value when the original variable is null.

Kotlin type system has distinguish two types of references that,
can hold null (nullable references) and those that can not (non-null references).
 * */



/**
 * we use Elvis operator (?) to assign a variable null and use ! - exclimanation mark to by pass null ,
 * mean to say if something assigned null with ? and now we want to access that so we use !!.
 *
 *
 * LIKE ;-
 * */

fun main(){

    /**
     *    USING ? - ELVIS OPERATOR WE ARE SAYING TO KOTLIN THAT IT COULD BE NULL
     *
     * */
    var name4:Int? = 2
    name4 = null


    /**
     *    EVEN IF YOU DO THAT YOU NEED TO USE !! OPERATOR TO SAY THAT YES I HAVE ASSIGNED AND YOU CAN USE IT NOW,
     *    ITS AN CONFIRMATION THAT WE HAVE ASSIGNED THE VALUE
     * */

    println( " $name4 " )


    /**
     *
     *
     * */
    var name:String? = null

    name = "this--"

    var name2: String? = null
name2 = "this is too "
    var name3:Int = 1

   // print(name!!.length)
    //  EVEN AFTER USING !! SING IT WILL CRASH , BECAUSE
   //IT IS JUST BY PASSING THE NULL POINTER EXCEPTION NOT ASSIGNING IT NON -NULL,
  // ONLY ELVIS OPERATOR ? CAN BE USED AS NULLABLE ALLOWED
  // AND THAT'S WHY WE AVOID USING !! , BECAUSE IF WE FORGET TO ASSIGN IT BEFORE USING !! , ITS A NULL POINTER EXCEPTION.
  print("${name.length} ---- ${name2.length} ------ ${name3.plus(1)}  length this is correct")


}

