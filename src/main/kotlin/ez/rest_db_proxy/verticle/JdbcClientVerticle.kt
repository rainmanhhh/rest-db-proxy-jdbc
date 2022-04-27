package ez.rest_db_proxy.verticle

import ez.rest_db_proxy.config.JdbcDbConfig
import ez.rest_db_proxy.db.DbClientVerticle
import io.vertx.jdbcclient.JDBCPool
import io.vertx.sqlclient.SqlClient

class JdbcClientVerticle : DbClientVerticle<JdbcDbConfig>() {
  override val key: String = JdbcDbConfig.key
  override var configValue = JdbcDbConfig()

  override suspend fun createDbClient(): SqlClient {
    return JDBCPool.pool(vertx, configValue.connect, configValue.pool)
  }
}
