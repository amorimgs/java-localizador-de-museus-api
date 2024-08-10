package com.betrybe.museumfinder.solution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * The type Collection type controller test.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class CollectionTypeControllerTest {

  @Autowired
  private MockMvc mockMvc;

  /**
   * Test status.
   *
   * @throws Exception the exception
   */
  @Test
  void testStatus() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/collections/count/hist,imag")).andExpect(
        MockMvcResultMatchers.status().isOk());
  }
}
