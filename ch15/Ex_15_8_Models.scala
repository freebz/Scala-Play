// 코드 15-8 models/Models.scala/options - 제조회사 정보

def options: Seq[(String,String)] = DB.withConnection { implicit connection =>
  SQL("select * from company order by name")
    .as(Company.simple *).map(c => c.id.toString -> c.name)
}
