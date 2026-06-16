package org.example.tacocloud;

import org.example.tacocloud.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TestHomePage() throws Exception{
        mockMvc.perform(get("/")) //выполняет GET запрос
                .andExpect(status().isOk()) // ожидание код ответа HTTP 200
                .andExpect(view().name("home"))  // Ожидается имя представления home
                .andExpect(content().string(  //ожидается наличие строки "Welcome to..."
                        containsString("Welcome to...")));
    }
}
