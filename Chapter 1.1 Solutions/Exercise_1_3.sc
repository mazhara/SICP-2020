/**
 * Exercise 1.3 (page 27)
 * Define a procedure that takes three numbers
 * as arguments and returns the sum of the squares of the two
 * larger numbers.
 */
object ex_1_3 {
  def sum_square_two_largest(list: List[Int]): Int =
    list.sorted(Ordering.Int.reverse).take(2).map(x => x * x).sum

  def sum_square_two_largest(a: Int, b: Int, c: Int): Int =
    sum_square_two_largest(List(a, b, c))
}

import ex_1_3._
sum_square_two_largest(List(5, 4, 3, 8))
sum_square_two_largest(7, 6, 8)