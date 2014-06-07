package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c == 0 || r <= c ){ 1 } else pascal(c, r-1) + pascal(c-1, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
   
    def testBalance(cflag:Int, chead:Char, ctail:List[Char] ):Int={
      if(cflag >= 0){
      if(ctail.isEmpty){
        chead match{
        	case '(' => cflag + 1
        	case ')' => cflag - 1
        	case _   => cflag
        }
      } else{
        chead match{
        	case '(' => testBalance(cflag + 1, ctail.head, ctail.tail)
        	case ')' => testBalance(cflag - 1, ctail.head, ctail.tail)
        	case _   => testBalance(cflag, ctail.head, ctail.tail)
        }
      }
      } else -1
    }

    if(testBalance(0, chars.head, chars.tail) == 0) true else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = { 
     (money, coins) match {
    case (0, _) => 1
    case _ if (money < 0) => 0
    case (_, Nil) => 0
    case (_, coinsHead :: coinsTail) => countChange(money, coinsTail) + countChange(money - coinsHead, coins)
  }
  }
}
