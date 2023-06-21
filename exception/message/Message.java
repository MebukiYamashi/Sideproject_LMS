package exception.message;

public interface Message {
    String ERR_MSG_VALIDATION_EXCEPTION = "유효한 핸드폰번호가 아닙니다." + "\n" +
                                          "< 01011112222 >" + "\n" +
                                          "위와 같은 형식으로 입력해야 합니다.";

    String ERR_MSG_DUPLICATE_EXCEPTION = "이미 사용중인 ID입니다.";
}
