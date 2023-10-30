package example

def load[T](
  doLoad: Either[MyError, T]
)(
  description: T => Option[String] = (_: T) => None
): Unit = ???
