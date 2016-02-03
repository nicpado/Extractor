package unicredit

import com.typesafe.config.ConfigFactory

object Config extends {
  private val core = ConfigFactory.load()
  val conf = core.withFallback(ConfigFactory.load("tables.conf"))

  val nullConstant = conf.getString("null.constant")
  val separator = conf.getString("csv.separator")
}