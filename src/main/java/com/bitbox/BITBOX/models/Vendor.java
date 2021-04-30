package com.bitbox.BITBOX.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "VENDOR")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger vendorId;

    @NonNull
    private String name;

    @NonNull
    private String country;

    @OneToMany(mappedBy = "vendor")
    @JsonBackReference
    private List<Items> items;


}
