package example

import com.raquo.laminar.api.L.*
import scala.concurrent.Future

object Hello extends App {

  load(
      Left(MyError()): Either[MyError, MyData]
  )()

  load(
      Left(MyError()): Either[MyError, MyData2]
  )(
  )

}
