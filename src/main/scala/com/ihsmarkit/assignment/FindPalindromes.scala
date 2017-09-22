package com.ihsmarkit.assignment

import scala.collection.immutable

/**
  * This object class provides methods to find all palindromes of a given string.
  */
object FindPalindromes {

  def main(args: Array[String]): Unit = {
    if(null != args(0)) {
      printPalindromes(getPalindromes(args(0)))
    }
  }

  /*
  This public method just prints a list of palindromes, including the palindrome's starting index in the string and the length of the 
  string.
   */
  def printPalindromes(palindromes:immutable.List[(String, Int)]):Unit = {
    palindromes foreach (x => println(f"${x._1},${x._2},${x._1.length}"))
  }

  /*
  This public method returns a list of all palindromes found in a given string.
  The string value in the list's tuple represents a palindrome. It's related integer value is the palindrome's starting location in the string.
   */
  def getPalindromes(str: String): immutable.List[(String, Int)] = {
    val result = new scala.collection.mutable.ListBuffer[(String, Int)]()

    //Quick exit, return empty List
    if (null == str || str.isEmpty || str.length == 1) return result.toList

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
