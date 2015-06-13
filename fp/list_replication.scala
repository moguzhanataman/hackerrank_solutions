/**
 * Created by Oguzhan on 12.06.2015.
 */

import scala.collection.mutable.MutableList

object list_replication {
  def main(args: Array[String]) {
    f(5, List(1,2,3)).foreach(println)
  }

  def f(num: Int, arr: List[Int]): List[Int] = {
    val list = for (item <- arr) yield List.fill(num)(item)
    list.flatten
  }
}