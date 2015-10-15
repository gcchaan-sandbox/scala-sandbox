object Question2 {
  /**
   * @param a integer array
   * @param k such that a(i) + a(j) == k, i < j
   */
  def containsKey(a: List[Int], k: Int): Boolean = {
    a match {
      case i :: rest => {
        val j = k - i
        val res = rest.contains(j)
        if(res) true else containsKey(rest, k)
      }
      case _ => false
    }
  }
  def main(args: Array[String]) {
    // dummy
    val A = List(1, 5 ,5 ,36, 4, 9, 15, 5, 2, -1, 9, 0, 8, 9, 3, -6, 8, 6, 4, -3, 99)
    val K = 5
    println(containsKey(A, K))
  }
}
