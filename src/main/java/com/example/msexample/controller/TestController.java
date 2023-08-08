package com.example.msexample.controller;

import com.example.msexample.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;


    public void TestM(){
        testService.test();
    }
}
