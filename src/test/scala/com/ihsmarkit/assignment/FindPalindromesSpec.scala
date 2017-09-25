package com.ihsmarkit.assignment

package com.ihsmarkit.assignment

import org.scalatest.PrivateMethodTester._
import org.scalatest._

/**
  * Test cases for FindPalinDromes
  */
class FindPalindromesSpec extends FlatSpec {

  //Test public method getPalindromes
  "FindPalindromes object's public method getPalindromes" should "return empty List if string is either null or empty" in {
    assert(FindPalindromes.getPalindromes("").isEmpty == true)
    assert(FindPalindromes.getPalindromes(null).isEmpty == true)
  }

  it should "return empty List if string consists of only one character" in {
    assert(FindPalindromes.getPalindromes("A").isEmpty == true)
  }

  it should "return empty List if string consists more than 1 character but contains palindrome" in {
    assert(FindPalindromes.getPalindromes("ABCDEFG123A").isEmpty == true)
  }

  it should "toString of the return List should equals to string expectedResult defined below. " in {
    val expectedResult = "List((ILOVEUEVOLI,26), (LOVEUEVOL,27), (OVEUEVO,28), (RACECAR,13), (IAMAI,37), (VEUEV,29), (ACECA,14), (ABCBA,0), (AMA,38), (EUE,30), (RAR,19), (ARA,18), (CEC,15), (OHO,9), (BCB,1), (OO,48), (GG,46), (II,36), (LL,7))"
    assert(FindPalindromes.getPalindromes("ABCBAHELLOHOWRACECARAREYOUILOVEUEVOLIIAMAIDOINGGOOD").toString == expectedResult)
  }

  // Test private method isPalindrome
  "FindPalindromes object's private method isPalindrome" should "return false when string is null or empty" in {
    val testIsPalindrome = PrivateMethod[Boolean]('isPalindrome)
    assert((FindPalindromes invokePrivate testIsPalindrome(null)) == false)
    assert((FindPalindromes invokePrivate testIsPalindrome("")) == false)
  }

  it should "return false when string consists of only one character" in {
    val testIsPalindrome = PrivateMethod[Boolean]('isPalindrome)
    assert((FindPalindromes invokePrivate testIsPalindrome("A")) == false)
  }

  it should "return false when string is 'AijkA' which contains no palindrome" in {
    val testIsPalindrome = PrivateMethod[Boolean]('isPalindrome)
    assert((FindPalindromes invokePrivate testIsPalindrome("AijkA")) == false)
  }

  it should "return true when string is 'AA'" in {
    val testIsPalindrome = PrivateMethod[Boolean]('isPalindrome)
    assert((FindPalindromes invokePrivate testIsPalindrome("AA")) == true)
  }

  it should "return true when string is 'BDADB'" in {
    val testIsPalindrome = PrivateMethod[Boolean]('isPalindrome)
    assert((FindPalindromes invokePrivate testIsPalindrome("BDADB")) == true)
  }

  it should "return true when string is 'cBBabBC'" in {
    val testIsPalindrome = PrivateMethod[Boolean]('isPalindrome)
    assert((FindPalindromes invokePrivate testIsPalindrome("BBabB")) == true)
  }

  // Test public method printPalindromes
  "FindPalindromes object's public method printPalindromes" should "print nothing when string is null or empty" in {
    val empty1 = FindPalindromes.getPalindromes(null)
    FindPalindromes.printPalindromes(empty1)

    val empty2 = FindPalindromes.getPalindromes("")
    FindPalindromes.printPalindromes(empty2)
  }

  it should "print nothing when string consists of only one character" in {
    val str = FindPalindromes.getPalindromes("E")
    FindPalindromes.printPalindromes(str)
  }

  it should "print 'AA, 3, 2' when string is 'EFGAAHIJ'" in {
    println("Next one line is palindrome found in 'EFGAAHIJ':")
    val str = FindPalindromes.getPalindromes("EFGAAHIJ")
    FindPalindromes.printPalindromes(str)
  }

  it should "print 'BDB,6,3' followed by 'AA,3,2' when string is 'EFGAAHBDBIJ'" in {
    println("Next two lines are palindromes found in 'EFGAAHBDBIJ':")
    val str = FindPalindromes.getPalindromes("EFGAAHBDBIJ")
    FindPalindromes.printPalindromes(str)
  }

}
