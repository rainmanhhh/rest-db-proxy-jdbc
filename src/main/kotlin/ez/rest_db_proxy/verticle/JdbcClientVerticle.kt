package ez.rest_db_proxy.verticle

import ez.rest_db_proxy.db.DbClientVerticle
import ez.vertx.core.config.ConfigVerticle
import io.vertx.jdbcclient.JDBCPool
import io.vertx.sqlclient.SqlClient

class JdbcClientVerticle : DbClientVerticle() {
  override suspend fun createDbClient(): SqlClient {
    val jdbc: JdbcConfig by ConfigVerticle
    return JDBCPool.pool(vertx, jdbc.connect, jdbc.pool)
  }

  override fun path(): String = "_jdbc"
}
