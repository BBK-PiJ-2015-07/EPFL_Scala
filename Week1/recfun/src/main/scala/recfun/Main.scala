package recfun

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
      if(r < 0 || c < 0) 0
      if(c == 0 || c == r) 1
      else { pascal(c - 1, r - 1) + pascal(c, r - 1) }
  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanced(list: List[Char], bal: Int): Boolean = {
        if(list.isEmpty) bal == 0
        else
          if(list.head == '(') balanced(list.tail, bal+1)
          else
            if(list.head == ')') bal > 0 && balanced(list.tail, bal-1)
            else balanced(list.tail, bal)
      }
      balanced(chars,0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
