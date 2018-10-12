// 코드 15-5 models/Models.scala/list - 페이지 정보에 맞게 정보를 가져오는 메서드

def list(page: Int = 0, pageSize: Int = 10, orderBy: Int = 1, filter: String = "%"):
    Page[(Computer, Option[Company])] = {

  val offset = pageSize * page

  DB.withConnection { implicit connection =>

    val computers = SQL(
      """
        select * from computer
        left join company on computer.company_id = company.id
        where computer.name like {filter}
        order by {orderBy} nulls last
        limit {pageSize} offset {offset}
      """
    ).on(
      'pageSize -> pageSize,
      'offset -> offset,
      'filter -> filter,
      'orderBy -> orderBy,
    ).as(Computer.withCompany *)

    val totalRows = SQL(
      """
        select count(*) from computer
        left join company on computer.company_id = company.id
        where computer.name like {filter}
      """
    ).on(
      'filter -> filter
    ).as(scalar[Long].single)

    Page(computers, page, offset, totalRows)

  }

}
