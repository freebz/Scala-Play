// 코드 15-7 models/Models.scala/delete - 컴퓨터 정보 삭제 메서드

def delete(id: Long) = {
  DB.withConnection { implicit connection =>
    SQL("delete from computer where id = {id}")
      .on('id -> id).executeUpdate()
  }
}
