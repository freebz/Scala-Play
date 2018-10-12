// 코드 15-4 models/Models.scala/findById - 특정 컴퓨터 정보를 가져오는 메서드

def findById(id: Long): Option[Computer] = {
  DB.withConnection { implicit connection =>
    SQL("select * from computer where id = {id}")
      .on('id -> id).as(Computer.simple.singleOpt)
  }
}
