package com.greenfoxacademy.controllers;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.greenfoxacademy.TestingrestApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Bálint on 2017. 05. 15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestingrestApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void grootOk() throws Exception{
    String message = "some message";
    mockMvc.perform(get("/groot")
        .param("message", message)
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(message)))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void grootNoParam() throws Exception{
    mockMvc.perform(get("/groot"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void arrowOk() throws Exception {
    String distance = "100.0";
    String time = "10.0";
    mockMvc.perform(get("/yondu")
        .param("distance", distance)
        .param("time", time)
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.distance", is(100d)))
        .andExpect(jsonPath("$.time", is(10d)))
        .andExpect(jsonPath("$.speed", is(10d)));
  }

  @Test
  public void arrowNoParam() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide a distance!")));
  }

  @Test
  public void arrowNoDistance() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide a distance!")));
  }

  @Test
  public void arrowNoTime() throws Exception {
    mockMvc.perform(get("/yondu")
        .param("distance", "100.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide a time!")));
  }
}
