package com.bitbox.BITBOX.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "VENDOR")
public class Supliers {

    @Id
    @GeneratedValue
    private BigInteger vendorId;

    @NonNull
    private String name;

    @NonNull
    private String country;

    @NonNull
    private List<Items> items;
}
