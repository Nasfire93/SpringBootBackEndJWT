package com.bitbox.BITBOX.controller;

import com.bitbox.BITBOX.DAO.ItemsDAO;
import com.bitbox.BITBOX.models.Items;
import com.bitbox.BITBOX.models.RoleEnum;
import com.bitbox.BITBOX.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

@CrossOrigin("*")
@Controller
public class LoginController {
@Autowired
ItemsDAO itemsDAO;

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(Model model) {

        return ResponseEntity.ok(itemsDAO.findAll());
    }
    @GetMapping("/findItem")
    public ResponseEntity<?> findById(@RequestParam(name ="id",required = false) BigInteger id, Model model) {

        return ResponseEntity.ok(itemsDAO.findByItemsId(id));
    }
    @PostMapping("/addItem")
    public ResponseEntity<?> addItem(String data){
    System.out.println(data);
        return ResponseEntity.ok(data);
    }
}
