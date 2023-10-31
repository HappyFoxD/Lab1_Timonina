file:///D:/ScalaLabs/Lab1_Malakhov/hello-world/src/main/scala/Main.scala
### java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Symbols$Symbol.owner()" because the return value of "scala.reflect.internal.Trees$Apply.symbol()" is null

occurred in the presentation compiler.

action parameters:
offset: 755
uri: file:///D:/ScalaLabs/Lab1_Malakhov/hello-world/src/main/scala/Main.scala
text:
```scala
import util.Random
import scala.io.StdIn
import scala.collection.mutable.ListBuffer
object Main extends App {
  println("Enter the number of array elements: ")
  val amount = scala.io.StdIn.readInt
  
  println("Enter an upper limit for the numbers in the array (from 0 to ...): ")
  val max_value = scala.io.StdIn.readInt
  
  val list: List[Int] = List.fill(amount)(Random.nextInt(max_value))
  println(list)

  println("Choose the element: ")
  val a: Int = scala.io.StdIn.readInt

  val list2 = new ListBuffer[Int]()

  if (list.contains(a) == true) {
    for (i <- 0 to list.size-1) {
      if(a > list(i)0 {
        list2.append(list(i))
        println("check " + list2)
      }
    }
    list2.distinct
    println(list2.@@distinct)
  } else {
    println("Incorrect number!")
  }
  println(list2)
} 
```



#### Error stacktrace:

```
scala.meta.internal.pc.PcCollector.soughtTreeFilter$1(PcCollector.scala:248)
	scala.meta.internal.pc.PcCollector.$anonfun$resultWithSought$9(PcCollector.scala:266)
	scala.meta.internal.pc.PcCollector.$anonfun$resultWithSought$9$adapted(PcCollector.scala:266)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:348)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$1(PcCollector.scala:288)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$19(PcCollector.scala:469)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:169)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:165)
	scala.collection.immutable.List.foldLeft(List.scala:79)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:469)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$1(PcCollector.scala:288)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$19(PcCollector.scala:469)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:169)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:165)
	scala.collection.immutable.List.foldLeft(List.scala:79)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:469)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$1(PcCollector.scala:288)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$19(PcCollector.scala:469)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:169)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:165)
	scala.collection.immutable.List.foldLeft(List.scala:79)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:469)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$1(PcCollector.scala:288)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$19(PcCollector.scala:469)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:169)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:165)
	scala.collection.immutable.List.foldLeft(List.scala:79)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:469)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$1(PcCollector.scala:288)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$19(PcCollector.scala:469)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:169)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:165)
	scala.collection.immutable.List.foldLeft(List.scala:79)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:469)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$1(PcCollector.scala:288)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$19(PcCollector.scala:469)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:169)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:165)
	scala.collection.immutable.List.foldLeft(List.scala:79)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:469)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$1(PcCollector.scala:288)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$10(PcCollector.scala:409)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:169)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:165)
	scala.collection.immutable.List.foldLeft(List.scala:79)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:409)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$1(PcCollector.scala:288)
	scala.meta.internal.pc.PcCollector.$anonfun$traverseSought$10(PcCollector.scala:409)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:169)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:165)
	scala.collection.immutable.List.foldLeft(List.scala:79)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:409)
	scala.meta.internal.pc.PcCollector.traverseSought(PcCollector.scala:472)
	scala.meta.internal.pc.PcCollector.resultWithSought(PcCollector.scala:266)
	scala.meta.internal.pc.PcCollector.result(PcCollector.scala:207)
	scala.meta.internal.pc.PcDocumentHighlightProvider.highlights(PcDocumentHighlightProvider.scala:29)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$documentHighlight$1(ScalaPresentationCompiler.scala:340)
```
#### Short summary: 

java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Symbols$Symbol.owner()" because the return value of "scala.reflect.internal.Trees$Apply.symbol()" is null