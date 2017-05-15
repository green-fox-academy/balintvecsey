package com.greenfoxacademy.controllers;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.greenfoxacademy.TestingrestApplication;
import com.greenfoxacademy.models.RoraCargo;
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

  @Test
  public void cargoEmpty() throws Exception {
    mockMvc.perform(get("/rocket")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.caliber25", is(0)))
        .andExpect(jsonPath("$.caliber30", is(0)))
        .andExpect(jsonPath("$.caliber50", is(0)))
        .andExpect(jsonPath("$.shipstatus", is("empty")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void cargoFill25() throws Exception {
    String caliber = ".25";
    String amount = "5000";
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", caliber)
        .param("amount", amount)
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(".25")))
        .andExpect(jsonPath("$.amount", is(5000)))
        .andExpect(jsonPath("$.shipstatus", is("40%")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void cargoFull() throws Exception {
    String caliber = ".50";
    String amount = "12500";
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", caliber)
        .param("amount", amount)
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(".50")))
        .andExpect(jsonPath("$.amount", is(12500)))
        .andExpect(jsonPath("$.shipstatus", is("full")))
        .andExpect(jsonPath("$.ready", is(true)));
  }

  @Test
  public void cargoOverLoaded() throws Exception {
    String caliber = ".30";
    String amount = "13000";
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", caliber)
        .param("amount", amount)
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(".30")))
        .andExpect(jsonPath("$.amount", is(13000)))
        .andExpect(jsonPath("$.shipstatus", is("overloaded")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void cargoNoTime() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide a caliber!")));
  }
}
