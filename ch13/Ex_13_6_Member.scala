// 코드 13-6 models/Member.scala

def getList = db.withConnection { implicit connection =>
  SQL("SELECT * FROM member").as(basicMember *)
}
