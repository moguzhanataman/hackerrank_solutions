/**
 * Created by Oguzhan on 12.06.2015.
 */
object fp_filter_array {
  def main(args: Array[String]) {
    f(5, 1 to 10 toList).foreach(println)
  }

  def f(delim: Int, arr: List[Int]): List[Int] = {
    def filter(d: List[Int], p: Int => Boolean): List[Int] = {
      d.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>  if (p(x)) x :: xs else xs}
    }

    filter(arr, delim > _)
  }
}
