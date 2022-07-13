package com.example.kotlinexplained

/**where migrating new feature development to Kotlin resulted in a 33% reduction in codebase size
 * and a 30% reduction in the number of NPE crashes.
 * */



/**To use a property, simply refer to it by its name:

fun copyAddress(address: Address): Address {
val result = Address() // there's no 'new' keyword in Kotlin
result.name = address.name // accessors are called
result.street = address.street
// ...
return result
}*/


fun main(){

    var name:String? = null
    var age :Int? = null

        for (x in 1..10 step 2) {
            print(x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
    }


