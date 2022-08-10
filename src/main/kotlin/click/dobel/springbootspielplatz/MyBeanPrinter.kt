package click.dobel.springbootspielplatz

import org.springframework.boot.CommandLineRunner

class MyBeanPrinter(val myBean: MyBean): CommandLineRunner {
  override fun run(vararg args: String?) {
    print(myBean.name)
  }
}
