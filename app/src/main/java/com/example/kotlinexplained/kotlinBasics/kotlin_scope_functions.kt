package com.example.kotlinexplained.kotlinBasics

/**Scoped functions are functions that execute a block of code within the context of an object.
 *
 * These functions provide a way to give temporary scope to the object under consideration
 * where specific operations can be applied to the object within the block of code, thereby,
 * resulting in a clean and concise code.
 *
 *
 * There are five scoped functions in Kotlin: let, run, with, also and apply.
 *
 *
 *web link :- https://blog.mindorks.com/using-scoped-functions-in-kotlin-let-run-with-also-apply
 * */


class Person() {
    var name: String? = null
    var contactNumber: String = "1234567890"
    var address: String = "xyz"
    fun displayInfo() = print(
        "\n Name: $name\n " +
                "Contact Number: $contactNumber\n " +
                "Address: $address"
    )
}
    fun main() {
           LetExplained()
            RunExplained()
           WithExplained()
           ApplyExplained()
        AlsoExplained()
        }


  fun LetExplained (){
      val person = Person().let {
          it.name  = "shadab"

          /**
           * It is not necessary to write “return@let”. This is only done to enhance code readability.
           * In Kotlin, if the last statement in a “let” block is a non-assignment statement,
           * it is by default a return statement.
           * */

          "The name of the Person is: ${it.name}"
      }
      print(person)

      /**It refers to the context of the object by using the “it” keyword and hence,
       * this “it” can be renamed to a readable lambda parameter.
       *
       *
       * second advantage is it easily helps in providing null checks.
       * Let’s say we make the “name” parameter of the “Person” class nullable and
       * we want to print the name of the person only if it is a not null value,
       * then we can write a clean, simple and concise code a
       *
       *
       *
       * let” can also be used when we want to perform an operation on the result of a call chain.
       * */
      val numbers = mutableListOf("One","Two","Three","Four","Five")
      val resultsList = numbers.map { it.length }.filter { it > 3 }
      println(resultsList)
  }

  fun RunExplained (){
      /**
       * The “run” operator is similar to the “let” operator in terms of accepting a return value
       * that is different from the object
       * on which the scope function is being applied to.
       * Hence, a “run” operator can be used to initialize an object and return the result of it.
       * */



      /**One point here is that since the context is referred to as “this”,
       * it cannot be renamed to a readable lambda parameter. So depending on the use case and requirement
       * we have to choose between the let and the run operator.
       *  The “run” operator also helps in easy null checks similar to the “let” operator
       * */


      /***/

      /***/
      Person().run {

          /**So if run is similar to let in terms of accepting any return value,
           * what’s the difference? The difference is run refers to the context of the object as “this” and not “it”.
           * That is the reason we did not use “${this.name}” as it would be redundant here
           * since the block of code understands that “name” is used here concerning the Person object.
           * */

          name = "Asdf"
          contactNumber = "0987654321"
          "The details of the Person is: ${displayInfo()}  "
      }
  }

  fun WithExplained(){
      /**
       * So, if “with” is the same as “run”, what’s the difference?
       * How should we choose between these two? Now, this is an interesting case.
       * Let’s consider a case where a Person object can be nullable.
       * */

//      val person: Person? = null
//      with(person) {
//          this?.name = "asdf"
//          this?.contactNumber = "1234"
//          this?.address = "wasd"
//          this?.displayInfo()
//      }

      /**
       * So performing a null check using a “with” operator is difficult and
       * this is where we can replace it with “run” as follows:
       *
       * */

      val person: Person? = null
      person?.run {
          name = "asdf"
          contactNumber = "1234"
          address = "wasd"
          displayInfo()
      }

  }

  fun ApplyExplained(){
/**The apply function is similar to the run functionality
 * only in terms of referring to the context of the object as “this” and not “it”
 * and also in providing null safety checks:
 *
 * */

val person: Person? = null
      person?.apply {
          name = "asdf"
          contactNumber = "1234"
          address = "wasd"
          displayInfo()
      }


      /**Specifically for Android Development, "apply" can be useful in many cases.
       * We have many scenarios where we should return an instance of Intent or an Alert Dialog etc.,
       * by adding specific attributes to them.
       * */

      // Normal approach
//      fun createIntent(intentData: String, intentAction: String): Intent {
//          val intent = Intent()
//          intent.action = intentAction
//          intent.data = Uri.parse(intentData)
//          return intent
//      }

      // Improved approach, by using apply
//      fun createIntent(intentData: String, intentAction: String) =
//          Intent().apply {
//              action = intentAction
//              data = Uri.parse(intentData)
//          }

/**
 * apply vs run
 *
 *run accepts a return statement whereas “apply”
 * does not accept a return statement(we can see the error thrown by the IDE in the image)
 * and always returns the same object which it is referring to
 *
 * */


  }

  fun AlsoExplained(){

      /**
       * The advantage of using “also” operator is that while doing a chain of operations,
       * this operator helps in evaluating the current operating value if required.
       * Let’s suppose we did not use the “also” operator in the above case, we should have written the code as:
       * */


      val name = Person().also { currentPerson ->
          print("Current name is: ${currentPerson.name}\n")
          currentPerson.name = "modifiedName"
      }.run {
          "Modified name is: $name\n"
      }
      print(name)
      
  }



