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

    @RequestMapping("admin")
    public String login() {
        return "forward:admin_attence_list";
    }

    @RequestMapping("admin_attence_list")
    public String list(Model model) {
        List<Attence> cs = attenceService.list();
        model.addAttribute("cs", cs);
        return "listAttence";
    }

    @RequestMapping("admin_attence_add")
    public String add(Attence attence) {
        System.out.println(attence.toString());
        attenceService.add(attence);
        return "redirect:admin_attence_list";
    }

    @RequestMapping("admin_attence_delete")
    public String delete(int id) {
        attenceService.delete(id);
        return "redirect:admin_attence_list";
    }

    @RequestMapping("admin_attence_selectById")
    public String selectById(int id, Model model) throws Exception {

        Attence attence = attenceService.get(id);
        model.addAttribute("attence", attence);

        return "editAttence";
    }

    @RequestMapping("admin_attence_update")
    public String update(Attence attence, Model model) throws Exception {
        System.out.println(attence.toString());
        attenceService.update(attence);
        return "redirect:admin_attence_list";
    }


}
