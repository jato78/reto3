package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.model.AdminModel;
import com.grupoG32.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> obtener(){
        return adminService.obtener();


    }

    @PostMapping("/save")
    public void crear(@RequestBody AdminModel admin){
        adminService.crear(admin);


    }
}
