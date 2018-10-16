// 코드 17-4 JsValue 바로 설계하기

val json: JsValue = Json.obj(
  "name" -> "Book Catalogue",
  "date" -> Json.obj(),
  "books" -> Json.arr(
    Json.obj(
      "title" -> "XML 실전 가이드",
      "price" -> 39000,
      "genre" -> "컴퓨터"
    ),
    Json.obj(
      "title" -> "101개의 초콜릿",
      "price" -> 43000,
      "genre" -> "판타지"
    )
  )
)
