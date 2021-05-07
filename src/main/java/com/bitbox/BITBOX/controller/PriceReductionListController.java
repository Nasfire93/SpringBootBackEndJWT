package com.bitbox.BITBOX.controller;

import com.bitbox.BITBOX.DAO.ItemsDAO;
import com.bitbox.BITBOX.DAO.PriceReductionDAO;
import com.bitbox.BITBOX.DAO.VendorDAO;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Type;
import java.time.LocalDate;
@CrossOrigin("*")
@Controller
@RequestMapping("/priceReduction")
public class PriceReductionListController{
    @Autowired
    ItemsDAO itemsDAO;

    @Autowired
    VendorDAO vendorDAO;

    @Autowired
    PriceReductionDAO priceReductionDAO;

        private static final Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
            }
        }).create();

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(Model model) {

        return ResponseEntity.ok(priceReductionDAO.findAll());
    }
}
