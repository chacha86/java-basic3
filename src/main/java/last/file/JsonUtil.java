package last.file;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    public String toJsonString(Post post) {
        // Person 객체 생성

        // Jackson의 ObjectMapper 객체 생성
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // 객체를 JSON 문자열로 직렬화
            String jsonString = objectMapper.writeValueAsString(post);
            return jsonString;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Post toPost(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Post post = objectMapper.readValue(jsonString, Post.class);
            return post;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
