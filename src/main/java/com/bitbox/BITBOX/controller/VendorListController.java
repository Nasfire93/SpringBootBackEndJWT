package com.bitbox.BITBOX.controller;

import com.bitbox.BITBOX.DAO.ItemsDAO;
import com.bitbox.BITBOX.DAO.VendorDAO;
import com.bitbox.BITBOX.models.Items;
import com.bitbox.BITBOX.models.Vendor;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.time.LocalDate;
@CrossOrigin("*")
@Controller
@RequestMapping("/vendor")
public class VendorListController {
        @Autowired
        VendorDAO vendorDAO;

        private static final Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
            }
        }).create();

        @GetMapping("/findAll")
        public ResponseEntity<?> findAll(Model model) {

            return ResponseEntity.ok(vendorDAO.findAll());
        }

        @GetMapping("/findVendor")
        public ResponseEntity<?> findById(@RequestParam(name ="id",required = false) BigInteger id, Model model) {

            return ResponseEntity.ok(vendorDAO.findByVendorId(id));
        }

        @PostMapping(path = "/addVendor")
        public ResponseEntity<?> addItem(@RequestBody String data){
            Vendor vendor = gson.fromJson(data, Vendor.class);
            //item.setVendor(vendorDAO.findByVendorId(new BigInteger("1")));
            //item.setItemsId(itemsDAO.findTopByOrderByItemsIdDesc().getItemsId().add(new BigInteger("1")));
            vendorDAO.save(vendor);
            return ResponseEntity.ok("");
        }

        @PostMapping(path = "/deleteVendor")
        public ResponseEntity<?> deleteItem(@RequestBody String data){
            Vendor vendor = gson.fromJson(data, Vendor.class);
            vendorDAO.delete(vendorDAO.findByVendorId(vendor.getVendorId()));
            return ResponseEntity.ok("");
        }
}

