// 코드 14-5 modles/MemberService.scala

def insert(member: Member) = {
  DB.withConnection { implicit connection =>
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
