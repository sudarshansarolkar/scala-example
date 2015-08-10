/**
 * Created by Sudarshan on 8/7/2015.
 */

class QSort {
  def sort(xs: Array[Int]) {
    def
    swap(i: Int, j: Int) {
      val
      t = xs(i);
      xs(i) = xs(j);
      xs(j) = t
    }
    def
    sort1(l: Int, r: Int) {
      val
      pivot = xs((l + r) / 2)
      var
      i = l;
      var
      j = r
      while
      (i <= j) {
        while
        (xs(i) < pivot) i += 1
        while
        (xs(j) > pivot) j -= 1
        if
        (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if
      (l < j) sort1(l, j)
      if
      (j < r) sort1(i, r)
    }
    sort1(0, xs.length - 1)
  }
}

object QSortDriver extends App {
  val arr = new Array[Int](5);
  var myList = Array(3, 2, 1, 5)
  val qs = new QSort();
  qs.sort(myList)

  for (a <- myList) {
    println(s" ${a}")
  }

  println("Hello, world!")
}

