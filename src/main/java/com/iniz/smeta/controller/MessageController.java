package com.iniz.smeta.controller;

import com.iniz.smeta.entity.*;
import com.iniz.smeta.service.DefaultTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class MessageController {
    @Autowired
    private DefaultTService defaultTService;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/login")
    public String login(Map<String, Object> model) {
        return "login";
    }

    @GetMapping("/estimate")
    public String estimate(Map<String, Object> model) {
        return "estimate";
    }

    @GetMapping("/journal")
    public String journal(Map<String, Object> model) {
        return "journal";
    }

    @GetMapping("/test2")
    public String test2(Model model) {
        List<T2> allT2 = defaultTService.findAllT2();
        model.addAttribute("all", allT2);
        return "test2";
    }

    @GetMapping("/test3")
    public String test3(Model model) {
        List<T3> allT3 = defaultTService.findAllT3();
        model.addAttribute("all", allT3);
        return "test3";
    }

    @GetMapping("/test4")
    public String test4(Model model) {
        List<T4> allT4 = defaultTService.findAllT4();
        model.addAttribute("all", allT4);
        return "test4";
    }

    @GetMapping("/test5")
    public String test5(Model model) {
        List<T5> allT5 = defaultTService.findAllT5();
        model.addAttribute("all", allT5);
        return "test5";
    }

    @GetMapping("/test8")
    public String test8(Model model) {
        List<T8> allT8 = defaultTService.findAllT8();
        model.addAttribute("all", allT8);
        return "test8";
    }

    @GetMapping("/test9")
    public String test9(Model model) {
        List<T9> allT9 = defaultTService.findAllT9();
        model.addAttribute("all", allT9);
        return "test9";
    }

    @GetMapping("/test58")
    public String test58(Model model) {
        List<T58> allT58 = defaultTService.findAllT58();
        model.addAttribute("all", allT58);
        return "test58";
    }

    @GetMapping("/test80")
    public String test80(Model model) {
        List<T80> allT80 = defaultTService.findAllT80();
        model.addAttribute("all", allT80);
        return "test80";
    }

    @GetMapping("/test81")
    public String test81(Model model) {
        List<T81> allT81 = defaultTService.findAllT81();
        model.addAttribute("all", allT81);
        return "test81";
    }


/*
    @GetMapping("/get-t3")
    public String getAllfromT3(Model model) {

        List<T3> all = defaultT3Service.findAll();
        model.addAttribute("all", all);
        return "test1";
    }
*/
}
