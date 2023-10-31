file:///D:/ScalaLabs/Lab1_Malakhov/hello-world/src/main/scala/Main.scala
### java.lang.ClassCastException: class scala.reflect.internal.Types$PolyType cannot be cast to class scala.reflect.internal.Types$OverloadedType (scala.reflect.internal.Types$PolyType and scala.reflect.internal.Types$OverloadedType are in unnamed module of loader java.net.URLClassLoader @6f9780)

occurred in the presentation compiler.

action parameters:
offset: 83
uri: file:///D:/ScalaLabs/Lab1_Malakhov/hello-world/src/main/scala/Main.scala
text:
```scala
object Main extends App {
  println("Hello, World!")
  
  val Values = Seq.fill[@@]

  val Value = readln("Введите число")
}
```



#### Error stacktrace:

```
scala.reflect.internal.Symbols$Symbol.alternatives(Symbols.scala:2012)
	scala.meta.internal.pc.SignatureHelpProvider$MethodCall.alternatives(SignatureHelpProvider.scala:154)
	scala.meta.internal.pc.SignatureHelpProvider$MethodCallTraverser.$anonfun$fromTree$2(SignatureHelpProvider.scala:282)
	scala.meta.internal.pc.SignatureHelpProvider$MethodCallTraverser.$anonfun$fromTree$2$adapted(SignatureHelpProvider.scala:281)
	scala.Option$WithFilter.$anonfun$withFilter$1(Option.scala:362)
	scala.Option$WithFilter.$anonfun$withFilter$1$adapted(Option.scala:362)
	scala.Option$WithFilter.map(Option.scala:319)
	scala.meta.internal.pc.SignatureHelpProvider$MethodCallTraverser.fromTree(SignatureHelpProvider.scala:281)
	scala.meta.internal.pc.SignatureHelpProvider.signatureHelp(SignatureHelpProvider.scala:27)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$signatureHelp$1(ScalaPresentationCompiler.scala:282)
```
#### Short summary: 

java.lang.ClassCastException: class scala.reflect.internal.Types$PolyType cannot be cast to class scala.reflect.internal.Types$OverloadedType (scala.reflect.internal.Types$PolyType and scala.reflect.internal.Types$OverloadedType are in unnamed module of loader java.net.URLClassLoader @6f9780)