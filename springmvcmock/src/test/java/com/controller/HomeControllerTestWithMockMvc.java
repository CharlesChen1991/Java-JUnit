package com.controller;

import com.service.SayHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by hao.e.chen on 9/6/2017.
 * This test case is without starting the server
 */

@RunWith(SpringRunner.class)
@WebMvcTest
public class HomeControllerTestWithMockMvc {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private SayHelloService service;

    @Test
    public void test() throws Exception {
        when(service.sayHello()).thenReturn("Hello Mock");
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello Mock")));
    }
}
