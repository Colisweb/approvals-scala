import com.github.writethemfirst.Approbation
import org.scalatest.flatspec.FixtureAnyFlatSpec

class Demo extends FixtureAnyFlatSpec with Approbation {
  it should "approve demo" in { approver =>
    approver.verify("demo")
  }

  it should "approve a case class" in { approver =>
    approver.verify(Seq(
      Person("John Doe", Address("calle Alvarez", 166)),
      Person("John Doe", Address("calle Alvarez", 166)),
      Person("John Doe", Address("calle Alvarez", 166)),
    ))
  }
}

final case class Person(name: String, address: Address)

final case class Address(street: String, number: Int)
