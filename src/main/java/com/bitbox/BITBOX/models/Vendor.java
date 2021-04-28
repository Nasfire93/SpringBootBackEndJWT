package com.bitbox.BITBOX.models;

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
    @GeneratedValue
    private BigInteger vendorId;

    @NonNull
    private String name;

    @NonNull
    private String country;

    @ManyToMany
    private List<Items> items;


}
