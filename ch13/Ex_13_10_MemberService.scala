// 코드 13-10 models/MemberService.scala

// models/Member.scala
package models

import javax.inject._
import play.api.db.DBApi
import anorm._
import anorm.SqlParser._
import java.util.Date

@Singleton
class MemberService @Inject() (dbapi: DBApi) {

  private val db = dbapi.database("default")

  val basicMember = {
    get[Int]("member.mid") ~
    get[String]("member.userid") ~
    get[String]("member.password") ~
    get[String]("member.nickname") ~
    get[String]("member.email") ~
    get[Option[Date]]("member.regdate") map {
      case mid ~ userid ~ password ~ nickname ~ email ~ regdate =>
        Member(mid, userid, password, nickname, email, regdate)
    }
  }

  def getList = db.withConnection { implicit connection =>
    SQL("SELECT * FROM member").as(basicMember *)
  }

}

case class Member(mid: Int, userid: String, password: String, nickname:
  String, email: String, regdate: Option[Date])

