package ez.rest_db_proxy.verticle

import ez.vertx.core.config.ConfigVerticle
import io.vertx.jdbcclient.JDBCConnectOptions
import io.vertx.sqlclient.PoolOptions

class JdbcConfigVerticle: ConfigVerticle<JdbcConfig>() {
  override var configValue: JdbcConfig = JdbcConfig()
  override val key: String = "jdbc"
}

class JdbcConfig {
  var connect = JDBCConnectOptions()
  var pool = PoolOptions()
}
