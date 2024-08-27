class Account(initialBalance: Double) {
    private var balance: Double = initialBalance

    def getBalance: Double = balance

    def deposit(amount: Double): Unit = {
        require(amount > 0, "Amount must be positive")
        balance = balance + amount
    }

    def withdraw(amount: Double): Boolean = {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount
            true
        }
        else {
            false
        }
    }

    def transfer(amount: Double, toAccount: Account): Boolean = {
        if(amount > 0 && amount <= balance){
            balance = balance - amount
            toAccount.deposit(amount)
            true
        }
        else{
            false
        }
    }
}

object Main extends App {
    val account1 = new Account(1000)
    val account2 = new Account(500)

    println("Initial Balances: ")
    println(s"Account1: ${account1.getBalance}")
    println(s"Account2: ${account2.getBalance}")
    println()

    account1.deposit(200)
    println(s"Account 1 after deposit: ${account1.getBalance}")

    val withdrawSuccess = account1.withdraw(300)
    if (withdrawSuccess) {
        println(s"Account 1 after withdrawal: ${account1.getBalance}")
    } 
    else {
        println("Withdrawal failed")
    }

    val transferSuccess = account1.transfer(150, account2)
    if (transferSuccess) {
        println(s"Account 1 after transfer: ${account1.getBalance}")
        println(s"Account 2 after transfer: ${account2.getBalance}")
    } 
    else {
        println("Transfer failed")
    }

}