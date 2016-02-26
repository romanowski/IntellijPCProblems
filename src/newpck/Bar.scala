package newpck

import some.pck.{Legacy => legacy}



class Bar {
  case class BarInner(val a1: legacy.Foo2 ) //Problem Foo2 is mark as not existing - project compiles

  val base: Option[IndexedSeq[String]] = ???

  val problem = base.getOrElse(???).map(_.size)

  val tmp = base.getOrElse(???)
  val correct = tmp.map(_.size)

  problem.head //Problem head is red - problem is inferred as "GenTraversableOnce[Int]"
  correct.head //but it should have IndexedSeq[Int]

}
