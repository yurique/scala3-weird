package example

trait Test {

  def load[T](
    doLoad: T
  )(
    description: T => Option[String] = (_: T) => None
  ): Unit = ???

}
