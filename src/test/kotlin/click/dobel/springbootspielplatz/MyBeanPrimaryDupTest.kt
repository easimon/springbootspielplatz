package click.dobel.springbootspielplatz

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import
import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("test")
@SpringBootTest(classes = [SpringbootspielplatzApplication::class])
@Import(MyBeanPrimaryDupTest.TestConfig::class)
class MyBeanPrimaryDupTest(
  val myBeanPrinter: MyBeanPrinter
) : FreeSpec({

  "MyBean should have name test" {
    myBeanPrinter.myBean.name shouldBe "test"
  }
}) {

  @TestConfiguration
  @Profile("test")
  class TestConfig {
    @Bean
    @Primary
    fun myBean() = MyBean("test")
  }
}

