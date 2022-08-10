package click.dobel.springbootspielplatz

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [SpringbootspielplatzApplication::class])
class MyBeanTest(
  val myBeanPrinter: MyBeanPrinter
) : FreeSpec({

  "MyBean should have name prod" {
    myBeanPrinter.myBean.name shouldBe "prod"
  }
})
