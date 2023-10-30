package example

import com.raquo.laminar.api.L.*

object Hello extends App {

  load(
    EventStream.fromValue(
      Left(MyError()): Either[MyError, MyData]
    )
  )(
    title = _.title
  ) { data =>
    div("empty")
  }

  load(
    EventStream.fromValue(
      Left(MyError()): Either[MyError, MyData2]
    )
  )(
    title = _.title
  ) { data =>
    div("empty")
  }

}
