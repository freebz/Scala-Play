// 코드 16-8 models/Member

package models

import java.sql.Date
import java.util.Calendar
import scala.concurrent.Future
import javax.inject.{Inject, Singleton}
import play.api.db.slick.{DatabaseConfigProvider,HasDatabaseConfigProvider}
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._

case class Member(userSeq: Int, userId: String, password: String,
  nickname: String, score: Int, level: Int, regdate: Date)

class Members(tag: Tag) extends Table[Member](tag, "MEMBER") {
  def userSeq = column[Int]("userSeq", O.PrimaryKey, O.AutoInc)
  def userId = column[String]("userId")
  def password = column[String]("password")
  def nickname = column[String]("nickname")
  def score = column[Int]("score", O.Default(0))
  def level = column[Int]("level", O.Default(0))
  def regdate = column[Date]("regdate")

  def * = (userSeq, userId, password, nickname, score, level, regdate) <>
  ((Member.apply _).tupled, Member.unapply)
}

@Singleton()
class MemberDataAccess @Inject() (protected val dbConfigProvider:
    DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {

  val members = TableQuery[Members]

  def getList = {
    db.run(members.result)
  }

  def create = {
    db.run(members.schema.create)
  }

  def insert = {
    db.run(members += Member(1, "admin", "12345", "ThePresident", 100, 20,
      new java.sql.Date(Calendar.getInstance().getTimeInMillis)))
  }

}
