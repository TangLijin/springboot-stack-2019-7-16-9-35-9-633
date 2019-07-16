package com.tw.apistackbase.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EmployeesControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void should_return_expected_employee_when_call_getAllEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(
                        "[\n" +
                        "    {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"Xiaoming\",\n" +
                        "        \"gender\": \"Male\",\n" +
                        "        \"age\": 20\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 1,\n" +
                        "        \"name\": \"Xiaohong\",\n" +
                        "        \"gender\": \"Female\",\n" +
                        "        \"age\": 19\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 2,\n" +
                        "        \"name\": \"Xiaozhi\",\n" +
                        "        \"gender\": \"Male\",\n" +
                        "        \"age\": 15\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 3,\n" +
                        "        \"name\": \"Xiaogang\",\n" +
                        "        \"gender\": \"Male\",\n" +
                        "        \"age\": 16\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 4,\n" +
                        "        \"name\": \"Xiaoxia\",\n" +
                        "        \"gender\": \"Female\",\n" +
                        "        \"age\": 15\n" +
                        "    }\n" +
                        "]"));
    }

    @Test
    public void should_return_expected_employee_when_call_addEmproyee(){
        String requestBody = "[\n" +
                "    {\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"Xiaoming\",\n" +
                "        \"gender\": \"Male\",\n" +
                "        \"age\": 20\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Xiaohong\",\n" +
                "        \"gender\": \"Female\",\n" +
                "        \"age\": 19\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"Xiaozhi\",\n" +
                "        \"gender\": \"Male\",\n" +
                "        \"age\": 15\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 3,\n" +
                "        \"name\": \"Xiaogang\",\n" +
                "        \"gender\": \"Male\",\n" +
                "        \"age\": 16\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 4,\n" +
                "        \"name\": \"Xiaoxia\",\n" +
                "        \"gender\": \"Female\",\n" +
                "        \"age\": 15\n" +
                "    }\n" +
                "]";
//        mockMvc.perform(post("/employees")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(requestBody)
//                .accept(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json());

    }


}