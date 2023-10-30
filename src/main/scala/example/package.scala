import com.raquo.laminar.api.L.*
import scala.concurrent.Future

package object example {

  def load[T](
    doLoad: Either[MyError, T]
  )(
    description: T => Option[String] = (_: T) => None
  ): Unit = ???

}
