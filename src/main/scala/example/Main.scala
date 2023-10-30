package example

object Main extends App with Test {

  case class MyData()
  case class MyData2()

  load(MyData())()
  load(MyData2())()

}

trait Test {

  def load[T](
    doLoad: T
  )(
    description: T => Option[String] = (_: T) => None
  ): Unit = ???

}
