package com.example.demo.controller;

import com.example.demo.Phone;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
    public class MainController {

        @Value("${welcome.message}")
        private String message;

        @Value("${second.message}")
        private String secondmessage;

        @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
        public String index(Model model) {
            model.addAttribute("message", message);

            List<Phone> lp = new ArrayList<>();
            lp.add(new Phone("Иванов Иван Иванович", "381458120"));
            lp.add(new Phone("Ханинова Ирина Леонидовна ", "141454731"));
            lp.add(new Phone("Каменских Елизар Андроникович ", "950410645"));
            lp.add(new Phone("Аникин Викентий Касьянович", "520401509"));
            lp.add(new Phone("Астанков Парфен Елисеевич", "747816357"));
            model.addAttribute("secondmessage",secondmessage);
            model.addAttribute("phones",lp);
            return "index";
        }
    }
