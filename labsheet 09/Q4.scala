class Account(initialBalance: Double) {
    private var balance: Double = initialBalance

    def getBalance: Double = balance

    def applyInterest(): Unit = {
        if(balance > 0){
            balance = balance + balance * 0.05
        }
        else {
            balance = balance - balance * 0.1
        }
    }
}

object Bank {
    def negativeBalanceAccounts(accounts: List[Account]) : List[Account] = {
        accounts.filter((_.getBalance < 0))
    }

    def totalBalance(accounts: List[Account]) : Double = {
        accounts.map(_.getBalance).sum
    } 

    def applyInterestToAccounts(accounts: List[Account]) : Unit = {
        accounts.foreach(_.applyInterest())
    }
}

object Main extends App {
    val account0 = new Account(1000)
    val account1 = new Account(-500)
    val account2 = new Account(200)
    val account3 = new Account(1500)
    val account4 = new Account(-100)
    val account5 = new Account(800)

    val bankAccounts = List(account0, account1, account2, account3, account4, account5)

    println("Negative balance accounts:")
    val negativeBalances = Bank.negativeBalanceAccounts(bankAccounts)
    negativeBalances.foreach(account => 
        val index = bankAccounts.indexOf(account)
        println(s"Account${index}: ${account.getBalance}")
    )
    println()

    val totalBalances = Bank.totalBalance(bankAccounts)
    println(s"Total balance of all accounts: $totalBalances")
    println()

    println("Balances after applying interest:")
    Bank.applyInterestToAccounts(bankAccounts)
    bankAccounts.foreach(account => 
        val index = bankAccounts.indexOf(account)
        println(s"Account${index}: ${account.getBalance}")
    )
}