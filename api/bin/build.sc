import mill._, scalalib._

object Spring extends ScalaModule {
  def scalaVersion = "2.12.9"

  def ivyDeps = Agg(
    ivy"org.springframework.boot:spring-boot-starter-web:2.4.2",
    ivy"org.springframework.boot:spring-boot-starter-data-mongodb:2.4.2"
   )
}
