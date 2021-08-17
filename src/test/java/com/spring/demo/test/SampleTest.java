package com.spring.demo.test;

import com.spring.demo.SampleRunner;
import com.spring.demo.controller.SampleController;
import com.spring.demo.service.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@WebMvcTest(SampleController.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //내장 톰캣 사용시 TestRestTemplate 사용
//@AutoConfigureMockMvc
public class SampleTest {


    //기본적인 방법
    @Autowired
    MockMvc mockMvc;

    // rest 템플릿으로 사용하는방법
    @Autowired
    //TestRestTemplate testRestTemplate;

    //언싱크 테스트 방법
   //@Autowired
    //WebTestClient webTestClient;

    //서비스별로 볼수 있는 방법
    //@MockBean
    //SampleService MockSmapleService;


    @Test
    public void helloTest() throws Exception {
        mockMvc.perform(get("/helloTest"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello seyoung"))
                .andDo(print());

    }

   // @Test
   // public void helloTest2() throws Exception {
   //     when(MockSmapleService.getName()).thenReturn("seyoung");

        //언싱크 테스트 방법
    //    webTestClient.get().uri("/helloTest").exchange().expectStatus().isOk()
    //            .expectBody(String.class).isEqualTo("hello seyoung");

        // rest 템플릿으로 사용하는방법
     //   String result = testRestTemplate.getForObject("/helloTest", String.class);
     //   assertThat(result).isEqualTo("hello seyoung");

  //  }

    /*@Test
    public void helloThymeleaf() throws  Exception {

        mockMvc.perform(get("/helloThymeleaf"))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
                .andExpect(model().attribute("name",is("seyoung")));

    }*/

}
