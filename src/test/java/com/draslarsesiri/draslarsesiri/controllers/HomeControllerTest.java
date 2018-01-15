package com.draslarsesiri.draslarsesiri.controllers;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


public class HomeControllerTest {

    HomeController homeController;

    @Before
    public void setUp() throws Exception {

        homeController = new HomeController();
    }

    @Test
    public void home() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();

        mockMvc.perform(get("/home"))
                .andExpect(status().isOk())
                .andExpect(view().name("home/index"));
    }
}