// 코드 13-1 models/Member.scala

package models

import java.util.Date

case class Member (mid:Int, userid:String, password:String,
              nickname:String, email:String, regdate:Option[Date])

object Member {

}// end object Member

