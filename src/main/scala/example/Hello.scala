package example

import com.raquo.laminar.api.L.*

object Hello extends App {

  load(
    EventStream.fromValue(
      Left(MyError()): Either[MyError, MyData]
    )
  )()

  load(
    EventStream.fromValue(
      Left(MyError()): Either[MyError, MyData2]
    )
  )(
  )

}
