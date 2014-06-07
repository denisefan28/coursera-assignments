package objsets

object intsets{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
	val t1 = new NonEmpty(3, new Empty, new Empty);System.out.println("""t1  : <error> = """ + $show(t1 ))}
	
}
abstract class IntSet{
	def incl(x:Int):IntSet
	def contains(x:Int):Boolean
	def union(other:IntSet):IntSet
}

class Empty extends IntSet{
	def contains(x:Int):Boolean = false
	def incl(x:Int):IntSet = new IntSet(x, new Empty, new Empty)
	def union(other:IntSet):IntSet
}

class NonEmpty extends IntSet{
	def incl(x:Int):IntSet
	def contains(x:Int):Boolean
	def union(other:IntSet):IntSet
}
