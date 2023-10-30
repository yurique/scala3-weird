import com.raquo.laminar.api.L.*

package object example {

  def load[T](
    doLoad: EventStream[Either[MyError, T]]
  )(
    description: T => Option[String] = (_: T) => None,
  ): Unit = ???

}
