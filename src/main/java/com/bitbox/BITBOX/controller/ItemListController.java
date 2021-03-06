package com.bitbox.BITBOX.controller;

import com.bitbox.BITBOX.DAO.ItemsDAO;
import com.bitbox.BITBOX.DAO.VendorDAO;
import com.bitbox.BITBOX.models.Items;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.time.LocalDate;

@CrossOrigin("*")
@Controller
@RequestMapping("/items")
public class ItemListController {
    @Autowired
    ItemsDAO itemsDAO;

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

        return ResponseEntity.ok(itemsDAO.findAll());
    }

    @GetMapping("/findItem")
    public ResponseEntity<?> findById(@RequestParam(name ="id",required = false) BigInteger id, Model model) {

        return ResponseEntity.ok(itemsDAO.findByItemsId(id));
    }

    @PostMapping(path = "/addItem")
    public ResponseEntity<?> addItem(@RequestBody String data){
        Items item = gson.fromJson(data, Items.class);
        itemsDAO.save(item);
        return ResponseEntity.ok(item);
    }

    @PostMapping(path = "/deleteItem")
    public ResponseEntity<?> deleteItem(@RequestBody String data){
        Items item = gson.fromJson(data, Items.class);
        itemsDAO.delete(itemsDAO.findByItemsId(item.getItemsId()));
        return ResponseEntity.ok(item);
    }
}
