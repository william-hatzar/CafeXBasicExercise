object shopper extends App{

  def checkout(listItems:List[String]): Double ={

    var amountofCola = 0
    var amountofCoffee =0
    var amountofCheeseSandwich = 0
    var amountofSteakSandwich = 0
    val serviceCharge : Double = 20.00
    var totalCosts : Double = 0.00
    val tenPercentService : Double = 0.10
    var twentyPercentService : Double = 0.20

    for(i <-  0 until listItems.length) {
      listItems(i) match {
        case "Cola" => amountofCola += 1
        case "Coffee" => amountofCoffee += 1
        case "Cheese_Sandwich" => amountofCheeseSandwich += 1
        case "Steak_Sandwich" => amountofSteakSandwich += 1
      }
    }
    if(listItems contains "Cola") totalCosts = cola(amountofCola) + totalCosts
    if(listItems contains "Coffee") totalCosts = coffee(amountofCoffee) + totalCosts
    if(listItems contains "Cheese_Sandwich") {
      val serviceApplied = cheeseSandwich(amountofCheeseSandwich) * tenPercentService
      totalCosts = serviceApplied + cheeseSandwich(amountofCheeseSandwich) + totalCosts
    }
    if(listItems contains "Steak_Sandwich") {
      val serviceApplied = steakSandwich(amountofSteakSandwich) * twentyPercentService
      totalCosts = serviceApplied + steakSandwich(amountofSteakSandwich) + serviceCharge + totalCosts
    }
    totalCosts
  }

  def cola(amount :Int):Double={
    val totalCost = amount*0.50
    totalCost
  }

  def coffee(amount:Int):Double={
    val totalCost = amount*1.00
    totalCost
  }

  def cheeseSandwich(amount:Int):Double={
    val costBeforeService = amount*2.00
    costBeforeService
  }

  def steakSandwich(amount:Int):Double={
    val costBeforeService = amount*4.50
    costBeforeService
  }

  println(f"Cost is: £${checkout(List("Steak_Sandwich"))}")

}