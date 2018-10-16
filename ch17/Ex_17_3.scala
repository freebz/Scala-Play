// 코드 17-3 JSON 텍스트를 JsValue로 변환하기

import play.api.libs.json._

val json: JsValue = Json.parse("""
{
    "book": [
	{
	    "id":"book01",
	    "author": "고순자",
	    "title": "XML 실전 가이드",
	    "genre": "컴퓨터",
	    "price": "39000",
	    "description": "xml에 대해서 자세히 알 수 있는 책입니다."
	},
	{
	    "id":"book02",
	    "author": "김말자",
	    "title": "101개의 초콜릿",
	    "genre": "판타지",
	    "price": "43000",
	    "description": "초콜릿 101개가 서로 주인의 사랑을 독차지하기 위해
                            피 터지게 싸우는 내용입니다. 우수문학상, 베스트 셀러"
	}
    ]
}
""")
