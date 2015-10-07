object Opt1 {
  def main (args: Array[String]): Unit ={
    val (a, b, c, d, e, f) = (1,2,3,4,5,6)
//    val (a, b, c, d, e, f) = (104,35,77,36,29,6)
//    val (a, b, c, d, e, f) = (1,2,3,1,2,1)
    val mes = if ((b * d - a * e) != 0) {
      val x = (b * f - c * e).toFloat / (b * d - a * e).toFloat
//println(b * f - c * e)
//println(b * d - a * e)
      val y = (a * f - c * d).toFloat / (a * e - b * d).toFloat
      "x:" + x.toString() + ", y:" + y.toString
    } else {
      "解なし"
    }
    println(mes)
  }
}
