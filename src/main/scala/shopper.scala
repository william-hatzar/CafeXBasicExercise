object shopper extends App {

  def checkoutManager(shoppingList: List[String]): Double = {

    var price: Double = 0.00
    for (i <- 0 to shoppingList.length - 1) {
      shoppingList(i) match {
        case "Apple" => price += 0.25
        case "Orange" => price += 0.60
      }
    }
    price



  }

  println(s"Cost is: £${checkoutManager(List("Apple","Orange"))}")

}
