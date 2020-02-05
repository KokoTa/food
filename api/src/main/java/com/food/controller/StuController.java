package com.food.controller;

import com.food.pojo.Stu;
import com.food.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuController {

    @Autowired
    private StuService stuService;

    @GetMapping("/getStu")
    public Stu getStu(int id) {
        return stuService.getStuInfo(id);
    }

    @PostMapping("/saveStu")
    public void saveStu(@RequestBody Stu stu) {
        stuService.saveStu(stu);
    }

    @PostMapping("/updateStu")
    public void updateStu(int id) {
        stuService.updateStud(id);
    }

    @PostMapping("/deleteStu")
    public void deleteStu(int id) {
        stuService.deleteSut(id);
    }
}
