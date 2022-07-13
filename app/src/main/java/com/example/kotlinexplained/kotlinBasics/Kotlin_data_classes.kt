package com.example.kotlinexplained.kotlinBasics

/**
 *      JAVA HAS A PROBLEM IN TERMS OF POJO CLASS, LIKE TO CREATE POJO CLASS,
 *      NEED TO SET GETTER AND SETTER , ALSO TO STRING, ALSO EQUALS TO AND ALL.
 *      SO IT WILL BE NEAR ABOUT 50 LINES OF CODE.
 *
 *      WE CAN DO SAME STUFF IN KOTLIN USING 1 LINE USING DATA CLASSES
 * */

/**
 *  a data class can not be abstract or open or inner.
 *
 *  a data class can not accept empty constructor shadab() .
 *
 *  constructor parameters for data class should be initialize by val or var.
 *
 *  data class can have body for other operations.
 *
 *  data calss can inherit another class but can not inherit data classes.
 * */


// var age:Int IS DEFAULT ASSIGNMENT AND CAN OVERRIDE IT LATER
 data class shadab(val name:String, val last_name:String, var age:Int =10)
{
    var address:String = "420 whitmore ave."
    var phone:Long = 6476275076
}


     fun main(){

        val person = shadab("shadab","sheikh")
        // YOU CAN DIRECTLY CALL MEMBER FUNCTIONS.
        println(person.name)


        //no need to call toString() method
        println(person.age)





    }


