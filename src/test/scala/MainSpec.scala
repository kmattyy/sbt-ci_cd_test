import org.scalatest.FunSpec

class MainSpec extends FunSpec {

  describe("A test") {
    describe("when empty") {
      it("should do nothing ") {
        assert(1 == 1)
      }
    }
  }

}
