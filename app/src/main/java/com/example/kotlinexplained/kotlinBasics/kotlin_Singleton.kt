package com.example.kotlinexplained.kotlinBasics

/** SINGLETON PATTERN IS USED TO RESTRICT CLASSES NOT TO CREATE MORE THAN ONE OBJECT.
 *
 *  - reason behind restricting to create more than one object is to not to lose the context of the object,
 *  if we object is creating again and again we lose states and important data along it.
 *
 * // SINGLETON IN JAVA
 *
 *  public class Singleton {

    MAKING CONSTRUCTOR PRIVATE TO NOT ALLOW CREATING ANOTHER OBJECT.
    private static Singleton instance = null;

    private Singleton() {

    }
    public static Singleton getInstance() {
    if (instance == null) {
    synchronized (Singleton.class) {
    if (instance == null) {
    instance = new Singleton();
    }
    }}
    return instance;
}}
 * */




/**SINGLETON IN ANDROID USING KOTLIN
 *
 * */
object Singleton{

    init {
        println("Singleton class invoked.")
    }
    var variableName = "I am Var"
    fun printVarName(){
        println(variableName)
    }

/**   SCENARIOS WHERE WE NEED SINGLETON LIKE :-
 *
 *    CREATING A DATA BASE CONNECTIONS.
 *    USING SAME RETROFIT OBJECT AROUND THE CLASS STRUCTURE.
 *    CREATING SAME REPOSITORY OBJECT , NO NEED TO INITIALIZE IT AGAIN AND AGAIN.
 *
 * */


}
fun main() {
    Singleton.printVarName()
    Singleton.variableName = "New Name"
    Singleton.printVarName()
}