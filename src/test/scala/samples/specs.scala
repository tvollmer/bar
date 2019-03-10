package samples

import org.junit.runner.RunWith
import org.specs2._
import org.specs2.mutable.Specification
import org.specs2.matcher._
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeEach
//import org.scalacheck.Gen

/**
 * Sample specification.
 * 
 * This specification can be executed with: scala -cp <your classpath=""> ${package}.SpecsTest
 * Or using maven: mvn test
 *
 * For more information on how to write or run specifications, please visit: http://code.google.com/p/specs.
 *
 */
@RunWith(classOf[JUnitRunner])
class MySpecTest extends Specification /*with BeforeEach*/ /*with ScalaCheck*/ {

//  "My" should {
//    "allow " in {
//
//      //0
//    }
//    "deny " in {
//      //0
//    }
//  }

  "A List" should {
    "have a size method returning the number of elements in the list" in {
      List(1, 2, 3).size must_== 3
    }
    // add more examples here
    // ...
  }

}
