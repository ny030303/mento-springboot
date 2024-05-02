package com.springboot.project3;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GetController.class)
class GetControllerTest extends AbstractRestDocsTests {

    @Test
    void getHello() throws Exception {
        mockMvc.perform(get("/api/get-api/hello")).andExpect(status().isOk());
    }

    @Test
    void getName() throws Exception {
        mockMvc.perform(get("/api/get-api/name")).andExpect(status().isOk());
    }
}

