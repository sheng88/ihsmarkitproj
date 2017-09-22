package com.ihsmarkit.assignment

import scala.collection.immutable

/**
  * This object class provides methods to find all palindromes in a give string.
  * If you have sbt installed on your computer, the simplest way to run this class is navigate to the workspace
  * directory of this project. Then execute sbt to start the sbt command prompt. At the sbt command prompt, execute
  * run followed by the target string such as the following:
  * > run AABBC
  */
object FindPalindromes {

  def main(args: Array[String]): Unit = {
    if(null != args(0)) {
      printPalindromes(getPalindromes(args(0)))
    }
  }

  /*
  This public method returns a string representation of all the palindromes found in a given string.
   */
  def printPalindromes(palindromes:immutable.List[(String, Int)]):Unit = {
    palindromes foreach (x => println(f"${x._1},${x._2},${x._1.length}"))
  }

  /*
  This public method returns a List[(String, Int)] of all palindromes found in a given string.
  Data structure of the List element is tuple (String, Int) where by String is the found palindrome and
  Int is the starting position of the palindrome.
   */
  def getPalindromes(str: String): immutable.List[(String, Int)] = {
    val result = new scala.collection.mutable.ListBuffer[(String, Int)]()

    //Quick exit, return empty List
    if (null == str || str.length == 1) return result.toList

    val strLength = str.length
    for (i <- 0 to strLength) {
      for (j <- (i+1) to (strLength)) {
        val subStr = str.substring(i, j)
        if (isPalindrome(subStr)) {
          result += ((subStr, i))
        }
      }
    }
    result.toList.sortBy(_._1.length).reverse
  }

  /*
  This private method returns true if a given string is a palindrome, otherwise returns false.
   */
  private def isPalindrome(str: String): Boolean = {
    //Quick exit
    if (null == str || str.isEmpty || str.length == 1) return false

    //First, obtain a list of boolean results. Then apply AND operation on the list of boolean values.
    (for (i <- 0 to str.length / 2) yield (str(i) == str(str.length - i - 1))).reduceLeft((i, j) => i && j)
  }
}
