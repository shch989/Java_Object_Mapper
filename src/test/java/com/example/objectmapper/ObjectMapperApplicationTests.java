package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("hello");

        // Text JSON -> Object
        // Object -> Text JSON

        // controller req json(text) -> object
        // response object -> json(text)

        var objectMapper = new ObjectMapper();

        // object -> text (getter 생성 필수)
        var user = new User("semi", 10, "010-1111-2222");

        var text = objectMapper.writeValueAsString(user);
        System.out.println(user);

        // text -> object (디폴트 생성자 필수)
        Object objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }


}
