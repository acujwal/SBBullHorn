package com.example.bullhornapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    MessageRepository messageRepository;


    @RequestMapping("/")
    public String listMessage(Model model)


}
