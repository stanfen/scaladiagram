package muyan.graphviz

import org.scalatest.{FlatSpec, ShouldMatchers}

class GraphvizTest extends FlatSpec with ShouldMatchers{
    "gv" should "config should be read " in {
      val gv = new Graphviz(None, "png")
      gv.tmpDir.nonEmpty shouldBe(true)
    }
}
