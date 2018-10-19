// 코드 19-1 MD5 다이제스트 생성

import java.security.MessageDigest

def md5(s: String) = {
  MessageDigest.getInstance("MD5").digest(s.getBytes)
}
