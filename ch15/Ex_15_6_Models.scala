// 코드 15-6 models/Models.scala/update - 컴퓨터 정보 업데이트 메서드

def update(id: Long, computer: Computer) = {
  DB.withConnection { implicit connection =>
    SQL(
      """
        update computer
        set name = {name}, introduced = {introduced}, descontined =
                    {discontinued}, company_id = {company_id}
        where id = {id}
      """
    ).on(
      'id -> id,
      'name -> computer.name,
      'introduced -> computer.introduced,
      'discontinued -> computer.discontinued,
      'company_id -> computer.companyId
    ).executeUpdate()
  }
}
