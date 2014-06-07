package funsets
import funsets.FunSets._

object Main extends App {
  
  println(contains(singletonSet(1), 1))
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
    
    val s = map(union(union(s1,s2),s3), x=>x*x)
    printSet(s)
}
