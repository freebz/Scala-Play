// 코드 13-7 models/Member.scala / basicMember 구성

import anorm.SqlParser._

    val basicMember = {
      get[Pk[Int]]("member.mid")~
      get[String]("member.userid")~
      get[String]("member.password")~
      get[String]("member.nickname")~
      get[String]("member.email")~
      get[Option[Date]]("member.regdate") map {
        case mid~userid~password~nickname~email~regdate =>
          Member(mid,userid,password,nickname,email,regdate)
      }
    }

