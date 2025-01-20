import scala.io.StdIn

object firstprogram {

  def main(args: Array[String]): Unit = {
    println("Hello World")


    var a = 50
    var b = 40
    println(a, b)
    a = a ^ b
    b = b ^ a
    a = a ^ b
    println("Value of A is:", a)
    println("Value of B is:", b)

    //QUE-1
    var num = -36
    if (num % 2 == 0 && num > 0) {
      println("The number is Even & Positive")
    } else {
      println("THe number is not EVEN number")
    }

    var num1: Int = -15;
    if (num1 < -10 || num1 > 10) {
      println("The value is not as per condition")
    } else {
      println("The value is Matching to th condition")
    }


    var num2 = 27
    if (num2 % 2 != 0 && num2 % 3 != 0) {
      println(" The number is odd number but not divisible by 3")
    }
    else {
      println("The number is odd number and divisible by 3")
    }


    var num3 = 24
    if (num3 % 4 == 0 || num3 % 6 == 0) {
      println(" The number is divisible by given number")
    } else {
      println("The number is not divided by given number")
    }


    var age = 20
    if (age >= 18 || age >= 16) {
      println("Eligible")
    } else {
      println("not eligible")
    }


    var num4 = 25
    if (1 > num4 || 10 > num4) {
      println("Thee number present between 1 to 10")
    } else if (num4 < 20 || num4 < 30) {
      println("the number present between 20 to 30")
    } else {
      println("no value")
    }


    var num5 = -7
    if (num5 % 2 != 0 && num5 < 0) {
      println("The number is odd and Negative")
    } else {
      println("The number is odd and positive ")
    }


    var age1 = 63
    if (age1 > 60 || age1 < 25) {
      println("the candidate is eligible ")
    } else {
      println("Not Eligible Candidate")
    }

    var num6 = 35
    if (num6 % 7 == 0 && num6 % 5 == 0) {
      println("the number is divisible by 7,5")
    } else {
      println("The number is not divisible by 7,5")
    }


    var num7 = -8
    if (num7 < 0 || num7 % 2 == 0) {
      println("the number is non-negative and even Number")
    } else (
      println("THE Number is positive and oddnumber ")
      )


    var prime1 = 84
    if (prime1 % 1 == 0 && prime1 % prime1 == 0 && prime1 % 2 != 0) {
      println("The number is Prime number and ALso its is Odd number")
    } else {
      println("the number is Even Number and not prime number")
    }


    var purchase = 120
    if (purchase > 150 || purchase > 100) {
      println("the person is eligible for discount and free shipping")
    } else if (purchase > 100) {
      println("The Person is  only eligible for Free shipping")
    } else {
      println("No service")
    }


    var num8 = 24
    if (num8 % 3 == 0 || num8 % 8 == 0) {

      println("the number is divided by both 3,8")
    } else {
      println("the number is not divisible by 3,8)")
    }

    var number2 = -6
    var result13 = (number2 > 0 && number2 % 2 == 0)
    println(result13)

    var agelevel = 56

    if (agelevel < 13) {
      println("child")
    } else if (agelevel >= 13 && agelevel <= 19) {
      println("Teenager")
    } else if (agelevel >= 20 || agelevel > 20) {
      println("Adults")


    }

    var number3 = 25

    if (number3 % 2 == 0 || number3 % 5 == 0) {
      println("the number is divided by given number")

    } else {
      println("The number is not divisible by given Number")
    }

    var mul = 21
    if (mul % 3 == 0 && mul % 7 == 0) {
      println("The given Number is multiplication of both")
    } else {
      println("The given number is not mul of two given numbers")
    }

    for (i <- 20 to 10 by -1) {
      println(i)
    }

    println("The value of a is:")
    a = 10
    while (a >= 1) {
      println(a)
      a = a - 1
    }


    //for loop questions

    //1
    println("Printing value from 1 to 5")
    for (i <- 1 to 5) {
      println(i)
    }

    //2 print even numbers from 2 to 10 using while loop



    println("The Even Number 2 to 10")
    var even = 2

    while (even <= 10) {
      if (even % 2 == 0) {
        println(even)
      }
      even = even + 1
    }


    //4.CALCULATE THE SUM OF ALL 1 TO 50 USING FOR LOOP


    println("THe sum of all 1 to 50 numbers")
    var sum = 1
    for (i <- 1 to 50) {
      sum = sum + i
    }
    println(sum)



    //printing sum 0f all 50 using while loop
    println("sum of all 1 to 50 numbers using WHILE LOOP")
    var d = 1
    var cal = 1
    while (d <= 50) {
      cal = cal + d
      d = d + 1
    }
    println(cal)

    //4--SQUARE NUMBERS FROM 1 TO 5 USING FOR LOOP
    println("the square root of 1 to 5 numbers using FOR LOOP:")
    for (i <- 1 to 5) {
      var square = i * i
      println(square)
    }
    //4---using while loop
    println("the square root of 1 to 5 numbers using WHILE LOOP:")
    var e = 1
    while (e <= 5) {
      var sq = e * e
      println(sq)
      e = e + 1
    }

    //6 FIRST 5 MULTIPLES OF 3
    println("the first 5 multiples of 3")
    for (i <- 1 to 5) {
      var mul = 3 * i
      println(mul)
    }

    //7  ODD NUMBERS FROM 1 TO 15 USING WHILE LOOP

    println("ODD NUMBERS BETWEEN 1 to 15:")
    var odd = 1
    while (odd <= 15) {
      if (odd % 2 != 0) {
        println(odd)
      }
      odd = odd + 1
    }

    //8 CALCULATE FACTORIAL OF 5 USING FOR LOOP.

    println("Factorial of Number 5:")
    var f = 1
    for (i <- 1 to 5) {
      f = f * (i)
    }
    println(f)

    //10 CHECK THE NUMBER IS PRIME NUMBER USING WHILE LOOP:
    println("The Prime Number checking:")
    var g = 17
    while (g >= 0) {
      if (g % 2 != 0 && g % g == 0) {
        println("the number is Prime", g)
      } else {
        println("Not prime number")
      }
      g = g - 1
    }

    //12 FIND THE SUM OF ALL EVEN NUMBERS IN 1 TO 20 USING WHILE LOOP

    var eve = 1
    var sum2 = 1
    while (eve <= 20) {
      if (eve % 2 == 0) {
        println("The EVEN Numvbers :", eve)
        sum2 = sum2 + eve
      }
      eve = eve + 1
    }
    println("THe sum of all EVEN Numbers:", sum2)

    //9) PRINT THE CHARACTERS OF STRING IN REVERSE ORDER USING FOR LOOP

    println("Reverse String ")

    var name: String = "Rutuja"

    for (i <- name.length - 1 to 0 by -1) {
      println(name(i))
    }


    //5 PRINT GIVEN STRING IN REVERS USING WHILE LOOP:
    println("Reverse the String using WHILE LOOP:")
    var name4 = "Saurabh"
    var k = name4.length - 1
    while (k >= 0) {
      print(name4(k))
      k = k - 1
    }


    //PATTERN QUESTIONS..
    println("THe * Pattern")
    var s = 5
    for (i <- 1 to s) {
      for (j <- 1 to i) {
        print("*")
      }
      println()
    }

    //13 CHECK GIVEN STRING IS PALINDROME OR NOT.
    println("TO CHECK GIVEN STRING IS PALINDROME OR NOT:")
    var EMployeeName: String = "RUTUJA"

    var emp = ""

    for (i <- EMployeeName.length - 1 to 0 by -1) {
      emp = emp + EMployeeName.charAt(i)
    }
    println(emp)
    if (emp.equals(EMployeeName)) {
      println(" The String is Palindrome")
    } else {
      println("The String is not Palindrome")
    }




    // PRINT NUMBER PATTERN OF ACCORDING TO VALUE OF OUTER VALUE.
    //1
    //22
    //333
    //4444
    //55555
    //666666

    println("Print the star pattern of number:")
    var t = 6
    for (i <- 1 to t) {
      for (j <- 1 to i) {
        print(i)
      }
      println()
    }

    //PRINT THE PATTERN OF NUMBERS WHERE INTERNAL LOOP VALUE IS INCRESING BY 1 ACCORDING TO I VALUE
    //1
    //12
    //123
    //1234
    //12345
    //123456

    println("Print the star pattern of number:")
    var R = 6
    for (i <- 1 to R) {
      for (j <- 1 to i) {
        print(j)
      }
      println()
    }


    println("Print the star pattern of Last Number number:")
    var l = 6
    var lastNumber = 0
    for (i <- 1 to l) {
      for (j <- 1 to i) {
        lastNumber = lastNumber + 1
        print(lastNumber + " ")
      }
      println()

    }
    println("The PARTIAL DIAMOND*,WITH ONLY ONE MIDDLE LINE IS COMMON BETWEEN 2 DIAMOND pattern")
    var squ = 6

    for (i <- 1 to squ) {
      for (j <- 1 to i) {
        print(i)
      }
      println()

    }
    for (i <- squ - 1 to 1 by -1) {
      for (j <- 1 to i) {
        print(i)
      }
      println()
    }


    println("BUTTERFLY PATTERN")

    var m = 5
    for (i <- 1 to m) {
      for (j <- 1 to i) {
        print("*")
      }
      for (j <- 1 to 2 * (m - i)) {
        print(" ")
      }
      for (j <- 1 to i) {
        print("*")
      }
      println()
    }
    for (i <- m to 1 by -1) {
      for (j <- 1 to i) {
        print("*")
      }
      for (j <- 1 to 2 * (m - i)) {
        print(" ")
      }
      for (j <- 1 to i) {
        print("*")
      }
      println()
    }


    println("the SQUARE PATRERN")
    var squ1 = 5
    for (i <- 1 to squ1) {
      for (j <- 1 to i) {
        print(" * ")
      }
      for (j <- squ1 - 1 to i by -1) {
        print(" * ")
      }
      println()

    }


    //PRINTING THE CUBE OF GIVEN NUMBERS: USING WHILE
    println("CUBE")

    var n = 5
    var i = 1
    while (i <= n) {
      println(i * i * i)
      i = i + 1
    }
    println()

    //COUNT THE NUMBER OF VOWELS IN GIVEN STRING
    println("COUNT THE NUMBERS OF VOWELS IN STRING")
    var identity: String = "iccecream"
    var count: Int = 0
    for (i <- 0 until identity.length) {
      var ch: Char = identity.charAt(i)
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count = count + 1
      }

    }
    println(count)


    //PERFECT SQUARE NUMBER:
    println("THE PERFECT SQUARE NUMBER:")
    var sqNum = 89
    var g2 = 1
    while ((g2 * g2) <= sqNum) {
      if (g2 * g2 == sqNum) {
        print("the number is Perfect Square Number:")
        return
      }
      g2 = g2 + 1

    }
    println("the number not Perfect Square number")



    //6 full diamond

    println("full diamond")
    var p = 5
    for (i <- 1 to p) {
      for (j <- 1 to i) {
        print("*")

      }
      println()
    }


    println("FULL DIAMOND 2")
    var y = 5
    for (i <- 1 to y) {
      for (j <- y - 1 to i by -1) {
        print(" ")
      }
      for (j <- 1 to i) {
        print("*")
      }
      for (j <- 2 to i) {
        print("*")
      }
      println()
    }

    //lower half

    for (i <- y to 1 by -1) {
      for (j <- 1 to y - i) {
        print(" ")
      }
      for (j <- 1 to i) {
        print("*")
      }
      for (j <- 1 to i - 1) {
        print("*")
      }
      println()
    }

    //HALF DIAMPOND PART2

    var z = 5
    for (i <- 1 to z) {
      for (j <- 1 to z - i) {
        print(" ")
      }
      for (j <- 1 to i) {
        print("*")
      }
      for (j <- 2 to i) {
        print("*")
      }
      println()
    }
    for (i <- z - 1 to 1 by -1) {
      for (j <- 1 to z - i) {
        print(" ")
      }
      for (j <- 1 to i) {
        print("*")
      }
      for (j <- 2 to i) {
        print("*")
      }
      println()
    }


    //HOLLOW PATTERN
    var b7 = 4
    for (i <- 1 to b7) {
      for (j <- 1 to b7) {
        if (i == 1 || i == b7 || j == 1 || j == b7) {
          print("*")
        } else {
          print(" ")
        }

      }
      println()
    }

    var tri = 5
    for (i <- 1 to tri) {
      for (j <- 1 to i) {
        if (i == tri || j == 1) {
          print(" * ")
        } else {
          print(" o ")
        }
      }
      println()
    }

    println("EQUILATERAL TRIANGLE ")
    var r = 5
    for (i <- 1 to r) {
      for (j <- 1 to 9) {
        if (i == r || i + j == r + 1 || j - i == r - 1) {
          print("*")
        } else {
          print(" ")

        }

      }
      println()
    }

    println("Half Equilateral")
    var r1 = 5
    for (i <- 1 to r1) {
      for (j <- 1 to r1) {
        if (i == r || i + j == r1 + 1 || j == 5) {
          print("*")
        }
        else {
          print(" ")
        }
      }
      println()
    }
    /// LOWER HALF EQUILATORAL

    println("hollow DIAMOND IMAGE")
    var u = 7
    for (i <- 1 to u) {
      for (j <- 1 to 7) {
        if (i + j == 5 || j - i == 3 || i - j == 3 || i + j == 11) {
          print("*")
        } else {
          print(" ")
        }
      }
      println()
    }


    // parallelogram
    println("parallelogram")
    var m3 = 4
    for (i <- 1 to 4) {
      for (j <- 1 to 7) {
        if (i == 4 || i + j == 5 || i + j == 8 || i == 1) {
          print("*")
        } else {
          print(" ")
        }

      }
      println()
    }


    //LOGIC BUILDING QUESTIONS:--

    //1)CONVERSION KG TO GM
    println("CONVERSION KG TO GM")

    println("Please Enter the value:")
    var kilogram = StdIn.readDouble()

    var gram = kilogram * 1000

    println(gram)


    //2)DEGREE TO F

    println("Please enter the temp in celcius DEGREE")
    var degree = StdIn.readDouble()

    var ferriade = (degree * 9 / 5) + 32

    println(ferriade)


    //SEARCHING BIGGER NUMBER BY DECLARING 3 VARIABLES

    println("Please Enter the Numbers")

    var a5 = 11
    var b5 = 21
    var c5 = 30
    if (a5 > b5 && a5 > c5) {
      println("A is Biggest umber")
    } else if (b5 > a5 || b5 > c5) {
      println("B is Biggest Number")
    } else {
      println("C is biggest number")
    }

    //Write a java program that performs the following tasks.
    //a. Store a number in a variable
    //b. If value is not in range (100-1000) prints wrong number else follows
    //the steps
    //c. Check even or odd
    //d. If even divide the number by 3 and print the remainder
    //e. If odd divide the number by 2 and print the remainder.




    println("Plese Enter the value :")
    println("THE numberr TO check Present in RAnge or NOT")

    var digit: Int = StdIn.readInt()

    if (digit < 100 || digit > 1000) {
      println("THE NUMBER IS NOT IN RANGE:")
    } else {
      println("THE NUMBER IS IN RANGE:")
    }

    if (digit % 2 == 0) {
      println("the Even number")
    } else if (digit % 2 != 0) {
      println("ODD Number")
    }

    var remainder = digit % 3
    var remainder2 = digit % 2


    if (digit % 2 == 0 / 3) {
      println(remainder)
    } else if (digit % 2 != 0 / 2) {
      println(remainder2)
    }


    //5. Declare & initialize a number. Check whether the number is in range 0-100

    println("Please provide INPUT")
    var input = StdIn.readInt()

    if (input < 0 || input > 100) {
      println("INVALID INPUT")
    } else if (input > 90 && input < 100) {
      println("Super Smart")
    } else if (input > 80 && input < 90) {
      println("Print Smart")
    } else if (input > 70 && input < 80) {
      println("Print Smart Enough")
    } else if (input > 60 && input < 70) {
      println("Just Smart")
    } else if (input > 35 && input < 60) {
      println("NO Smart")
    } else if (input > 0 && input < 35) {
      println("Dump")
    }

    //7 SEEKHO BIGDATA 60

    var institute: String = "SEEKH BIGDATA"
    for (i <- 1 to 60) {
      println(institute)
    }

    //8 250 - 550 %11
    println("CHECK THE NUMBERS DIVISIBLE BY 11 250 -550")



    //number are divisible by11 250_550
    println("CHECK THE NUMBERS DIVIDED BY 11 20-550")

    for(i<-250 to 550){
      if(i%11==0){
        println(i)
      }
    }

   //. Write a program to sum all the numbers from 56 to 153.
    var summ=0
    for(i<-56 to 153){
     summ=summ+i
    }
    println("THE SUM OF NUMBERS:",summ)

    //Write a program to print all even numbers in range 700 to 900.
    println("FIND THE EVEN NUMBERS BETWWEN 700 - 900")
    var counti=0
    for(i<-700 to 900){
      if(i%2==0){
        println(i)
        count=count+1
      }
    }
    println("Total even number counts: ",count)


    //11. Write a program to print all odd numbers from 251 to 51. like (251,
    //249,...51

    println(" Write a program to print all odd numbers from 251 to 51. like (251,")
    for(i<-251 to 51 by -1){
      if (i%2!=0){
        println(i)
      }

    }

    //13. Write a program to print alternate even numbers from 20 to 140. Like
    //(20,24,28...)
    println("to print alternate even numbers from 20 to 140")
    for(i<-20 to 140 by 4){
      if(i%2==0 ){
        println(i)
      }
    }

    var id :String="Rutuja is Big Data Engineer"







  }







}











