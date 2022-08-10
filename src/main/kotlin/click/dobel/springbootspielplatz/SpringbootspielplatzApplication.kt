package click.dobel.springbootspielplatz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@SpringBootApplication
class SpringbootspielplatzApplication {

  @Configuration
  class Config {

    @Bean
    fun myBean() = MyBean("prod")
    
    @Bean
    fun myBeanPrinter(myBean: MyBean) = MyBeanPrinter(myBean)
  }
}

fun main(args: Array<String>) {
  runApplication<SpringbootspielplatzApplication>(*args)
}
