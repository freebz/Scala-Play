// 코드 16-7 models/Member

import java.sql.Date
import java.util.Calendar
import scala.concurrent.Future
import javax.inject.{Inject, Singleton}
import play.api.db.slick.{DatabaseConfigProvider,HasDatabaseConfigProvider}
import slick.driver.JdbcProfile

@Singleton()
class MemberDataAccess @Inject()(protected val dbConfigProvider:
    DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile]{
  val members = TableQuery[Members]
}
