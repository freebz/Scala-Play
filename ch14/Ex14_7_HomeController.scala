// 코드 14-7 파일 업로드 컨트롤러 구현

def uploadFile = Action(parse.multipartFormData) { request =>
  request.body.file("picture").map { picture =>
    import java.io.File
    val filename = picture.filename
    picture.ref.moveTo(new File(s"/tmp/picture/$filename"))
    Ok("파일 업로드 완료")
  }.getOrElse {
    Redirect(routes.HomeController.index).flashing("error" -> "파일이 없습니다")
  }
}
