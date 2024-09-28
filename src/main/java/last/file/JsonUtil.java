package last.file;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    // Object 타입은 자바의 모든 타입을 받을 수 있는 최상위 타입
    public String toJsonString(Object obj) {
        // Person 객체 생성

        // Jackson의 ObjectMapper 객체 생성
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // 객체를 JSON 문자열로 직렬화
            String jsonString = objectMapper.writeValueAsString(obj);
            return jsonString;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // T는 제네릭 타입 -> 메서드를 호출하는 시점에서 타입을 결정
    // Class 타입은 클래스 정보를 담고 있는 타입 -> 보통 클래스이름.class로 사용(예시: Post.class)
    // Class<T> cls -> T 타입 class 정보를 받을 수 있음

    public <T> T toObject(String jsonString, Class<T> cls) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            T obj = objectMapper.readValue(jsonString, cls);
            return obj;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
