package com.ihsmarkit.assignment

import scala.collection.immutable

/**
  * Created by sheng on 2017-09-19.
  */
object FindPalindromes {

  def main(args: Array[String]): Unit = {
    //val result = getPalindromes(args(0))

    val result = getStrPalindromes(args(0))
    if (null != result && !result.isEmpty) {
      //Sorts and prints any found palindromes.
      result foreach (x => println(f"${x._1},${x._2},${x._1.length}"))
    }
  }

  /*
  This public method returns all palindromes found  in a given string. The return List of tuples, each represents a found
  palindrome.
   */
  def getStrPalindromes(str: String): immutable.List[(String, Int)] = {
    //Quick exit
    if (null == str || str.length == 1) return null;

    val result = new scala.collection.mutable.ListBuffer[(String, Int)]()
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
  This method returns true of String str is a palindrome, otherwise returns false.
   */
  private def isPalindrome(str: String): Boolean = {
    //Quick exit
    if (null == str || str.isEmpty || str.length == 1) return false

    //Obtain a list of comparision results in boolean. Then apply AND operation on the list of boolean values.
    val bol = (for (i <- 0 to str.length / 2) yield (str(i) == str(str.length - i - 1))).reduceLeft((i, j) => i && j)
    bol
  }
}
