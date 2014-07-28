// var means it can be reasigned though...
// val jetSet = Set("Boeing", "Airbus") <- Would fail because it would make jetSet immutable.
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))
println(jetSet)
