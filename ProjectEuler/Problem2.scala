var x = 1
var y = 2
var z = 0
var sum = 2

while( y <= 4000000 ) {
  
  z = x + y

  if( z % 2 == 0)
    sum += z
  
  x = y
  y = z
}

println("Answer: " + sum)
