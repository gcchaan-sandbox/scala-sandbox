def calc(a: Float, b: Float,c: Float, d: Float, e: Float, f: Float) = {
  if ((b * d - a * e) == 0) {
    "解なし"
  } else {
    val x = (b * f - c * e) / (b * d - a * e)
    val y = (a * f - c * d) / (a * e - b * d)
    s"x=${x}, y=${y}"
  }
}
//println(calc(104, 35, 77, 36, 29, 6))
