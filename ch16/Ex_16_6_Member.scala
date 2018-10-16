// 코드 16-6 models/Member

package models

import slick.driver.MySQLDriver.api._
import java.sql.Date

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
