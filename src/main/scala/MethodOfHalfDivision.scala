object MethodOfHalfDivision
{
  def mpd(x: Double): Double =
    (2 * Math.pow(x, 3) - 10 * Math.pow(x, 2) - 6 )

  def main(args: Array [String]): Unit = {
    var a: Double = 1
    var b: Double = 6
    val e: Double = 0.001
    var x: Double = 0.0
    var k: Int = 1
    System.out.print("Умова y=4*x^3-3.5*x^2-3.5*x-0.5\n")
    System.out.print("[a=" + a + "; b=" + b + "]")
    System.out.print(" e=" + e)
    x = (a + b) / 2
    System.out.print(" Корінь рівняння:")
    System.out.print(x)
    while (Math.abs(b - a) > e){
      if (mpd(a) * mpd(x) <= 0F){
        b = x
      }
      else{
        a = x
      }
      x = (a + b) / 2
      k += 1
      System.out.print("\nТочність = ")
      System.out.print(Math.abs(b - a))
      System.out.print(" Ітерація ")
      System.out.print(k)
      System.out.print(" Корінь рівняння: ")
      System.out.print(x)
    }
    System.out.print("\nКількість ітерацій = ")
    System.out.print(k)
    System.out.print("\nКорінь рівняння: ")
    System.out.print(x)
  }
}