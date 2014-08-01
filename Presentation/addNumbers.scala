
object addNumbers {
  def addNumbers(nbrs: Int*): Int = {
    var total = 0
    for (nbr <- nbrs) { total += nbr }
    total
  }
}
