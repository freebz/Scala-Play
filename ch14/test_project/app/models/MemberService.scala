package models

import java.util.Date
import play.api.db.DBApi
import anorm._
import anorm.SqlParser._
import javax.inject._

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

  def insert(member: Member) = {
    db.withConnection { implicit connection =>
      SQL(
        """
          insert into member (userid, password, nickname, email, regdate)
          values ( {userid}, {password}, {nickname}, {email}, {regdate} )
        """
      ).on(
        'userid -> member.userid,
        'password -> member.password,
        'nickname -> member.nickname,
        'email -> member.email,
        'regdate -> member.regdate
      ).executeUpdate()
    }
  }

}

case class Member (mid:Int, userid:String, password:String,
              nickname:String, email:String, regdate:Option[Date])
