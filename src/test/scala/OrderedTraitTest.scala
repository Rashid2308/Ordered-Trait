import org.scalatest.funsuite.AnyFunSuite

class OrderedTraitTest extends AnyFunSuite {
  val emptySetObj = new EmptySet[number]

  test("To check if an EmptySet is including a number"){
    val obj = emptySetObj.include(number(7))
    assert(obj.contains(number(7)))
  }

  val nonEmptySetObj = new NonEmptySet[number](
    number(3),
    emptySetObj.include(element = number(2)),
    emptySetObj.include(element = number(1))
  )

  test("To check if an NonEmptySet is contains a number"){
    assert(nonEmptySetObj.contains(number(3)))
  }

  test("To check if an NonEmptySet does not contains a number"){
    assert(!nonEmptySetObj.contains(number(6)))
  }

}