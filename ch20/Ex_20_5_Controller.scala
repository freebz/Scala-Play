// 코드 20-5 흔한 컨트롤러 다국어 설정 컨트롤러 의존성 주입

import play.api.i18n.I18nSupport
import play.api.i18n.MessagesApi

class Controller @Inject() (val messagesApi: MessagesApi) extends Controller
    with I18nSupport
