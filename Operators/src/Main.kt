fun main() {
    testStrings();
    testOps()
    testCompare()
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