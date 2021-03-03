class TableOfElements {

  //method to write table
  def PrintTable(listOfElements : List[Int]) = {

    for (element <- listOfElements) {
      println("Table of " + element)

      //using loops to print table upto 10
      for (number <- 1 to 10) {
        println((number * element) + " ")
      }
      println(" ")
    }
  }
}

object table{
  def main (args: Array[String]): Unit = {
    val Table = new TableOfElements
    Table.PrintTable(List(2, 3))
  }
}