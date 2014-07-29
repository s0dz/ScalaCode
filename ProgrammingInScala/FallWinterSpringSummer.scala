import ChecksumAccumulator.calculate

// Using the Application trait
object FallWinterSpringSummer extends Application {
  for( season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}
