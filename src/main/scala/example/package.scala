package example

case class MyData()
case class MyError()
case class MyData2()

def load[T](
  doLoad: T
)(
  description: T => Option[String] = (_: T) => None
): Unit = ???

