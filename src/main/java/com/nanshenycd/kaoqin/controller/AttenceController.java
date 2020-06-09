package com.nanshenycd.kaoqin.controller;

import com.nanshenycd.kaoqin.pojo.Attence;
import com.nanshenycd.kaoqin.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class AttenceController {
    @Autowired
    AttenceService attenceService;

    @RequestMapping("admin_attence_list")
    public String list(Model model) {
        List<Attence> cs = attenceService.list();
        model.addAttribute("cs", cs);
        return "listAttence";
    }
}
