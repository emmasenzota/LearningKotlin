fun main() {
    testStrings();
    testOps()
    testCompare()
    testnull()
    ArrayLists()
}

fun testStrings(){
    var numberOfFlowers : Int = 10;
    var numberOfFish : Int = 25;

    // lets print these values in different manner
    // Remember the declaration is in "var" these values cannot change otherwise errors
    println("I have $numberOfFlowers flowers and $numberOfFish fish")
    println("I have a total of ${numberOfFish + numberOfFlowers} of living things \n")
}

fun testOps(){
    // initialization
    val num : Int = 3;
    val num1: Double = 4.0;

    val num2 = num * num1;

    val num3 = num2 / num;

    println("Times res= $num2 , and Division res = $num3 \n")
}

fun testCompare(){
    // going to check the RANGE operator and WHEN
    val students = 236;

    if(students in 1..25 || students%25 == 0){
        println("Make a class of 25 students ${students / 25} times \n")
    }
    else{
        println("Class not divisible into 25 students ")

        val studentsHalf = students/2 // half students to determine the range

        when(studentsHalf){
            0 -> println("No students")
            in 1..24 -> println("prepare a smaller class, Half of class is $studentsHalf \n")
            in 25..100 -> println("prepare bigger class, Half of class is $studentsHalf \n")
            else -> println("Take students into a Dining hall, Half of class is $studentsHalf \n")
        }
    }

}

fun testnull(){
    val checknull :Int? = null // this is how one declare null value
    val checknonNull : Int = 6;

    //Elvis operator ?:
    val newDecrementOnNull = checknull?.dec() ?:0
    println("On Null $newDecrementOnNull")

    val newDecrementNonNull = checknonNull?.dec() ?: 0
    println("On non null $newDecrementNonNull ")
}

/*
* @methode arrayLists
*
* learn declaration and how to manipulate
*
* new Lists
*  */
fun ArrayLists(){
//    declare a list
    val school = mutableListOf("Themi","meru","uhuru","kaloleni")
    println(school)

//    dealing with Arrays NB:- arrays are not mutable
//    Rules for val and var are the same as for Lists
    val secSchool = arrayOf("Moshi","zanaki","Umbwe")

//    combine arrays
    val priSchools = arrayOf("daraja 2","Themi","Meru")
    val combine = secSchool + priSchools
    println(java.util.Arrays.toString(combine))

//    Nested arrays and Lists
    val numbers = intArrayOf(1,4,8,9)
    val countries = listOf("Tanzania","Kenya","DRC","Burundi")
//    val oddList = listOf(numbers,countries,"very oddd",1.2) // hard to read contents cz java.util.Arrays.toString expect intArray

//     loops
    for(element in countries){
        print(element + " ")
    }

    for ((index,element) in countries.withIndex()){
        println("Item of $index is $element")
    }

//    dynamic allocation
//    for(i in 1..10) print(i)
//
//    for(i in 8 downTo 1) print(i)
//
//    for(i in 2..8 step 4) print(i)
//
//    for (i in 'c'..'h') print(i)

//    while() and do...while()
    var itarator = 0

    while(itarator < 10){
        itarator++
    }
    println("itarate $itarator times ")

    do{
        itarator--
    }while (itarator > 9)

    println("itarate $itarator times in do..while")

    repeat(2){
        println(java.util.Arrays.toString(secSchool))
    }

}
