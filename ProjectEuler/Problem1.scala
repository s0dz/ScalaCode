var sum = 0
var i = 0
var range = 1000

for ( i <- 1 until range
      if (i % 3 == 0) || (i % 5 == 0) ){
    sum += i
}

println("Answer: " + sum)
