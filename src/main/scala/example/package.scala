import com.raquo.laminar.api.L.*

package object example {

  def load[T](
    doLoad: EventStream[Either[MyError, T]]
  )(
    title: T => String,
    description: T => Option[String] = (_: T) => None,
    keywords: T => Option[String] = (_: T) => None,
  )(
    content: T => HtmlElement
  ): HtmlElement = ???

}
