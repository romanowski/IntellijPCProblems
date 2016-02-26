package impls

trait Foo {
  def foo(a: Int) = 1
}

object Foo{
  def foo = 0.2

  implicit def defImpl(x: Foo.type):Foo = FooImpl
}

object FooImpl extends Foo

object Bar {
  Foo.foo(1) //in (1): Application does not takes parameters
}