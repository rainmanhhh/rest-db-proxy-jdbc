package ez.rest_db_proxy.config

import io.vertx.jdbcclient.JDBCConnectOptions
import io.vertx.sqlclient.PoolOptions

class JdbcDbConfig {
  companion object {
    val key = "jdbc"
  }
  var connect = JDBCConnectOptions()
  var pool = PoolOptions()
}
