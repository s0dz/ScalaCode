// imperative style
def printArgs1(args: Array[String]): Unit = {
  var i = 0
  while( i < args.length) {
    println(args(i))
    i += 1
  }
}

// functional style
def printArgs2(args: Array[String]): Unit = {
  for(arg <- args)
    println(arg)
}

// or
def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}

val words = Array("Scala", "is", "fun", "!")

printArgs1(words)
printArgs2(words)
printArgs3(words)

// super functional!
// No side effects
// Function returns an "interesting value" (instead of Unit)
def formatArgs(args: Array[String]) = args.mkString("\n")

println(formatArgs(words))
