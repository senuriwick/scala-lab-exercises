import scala.io.StdIn

object Main extends App {
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", toSpecific))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",toSpecific))
}

def toUpper(name : String) : String = {
    name.toUpperCase()
}

def toLower(name : String) : String = {
    name.toLowerCase()
}

def formatNames(name : String, formatter: String => String) : String = {
    formatter(name)
}

def toSpecific(name : String) : String = {
        print("Enter an index to format: ")
        val i = StdIn.readInt()
        if(i < 0 || i >= name.length()) 
            return "Out of bound"
        else {
            return name.updated(i, if(name(i).isLower) name(i).toUpper else name(i))
        }
}



