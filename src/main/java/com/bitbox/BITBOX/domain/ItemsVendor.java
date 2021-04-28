package com.bitbox.BITBOX.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "ITEMS_VENDOR")
public class ItemsVendor {
    @Id
    @GeneratedValue
    private BigInteger idItemsVendor;
    @ManyToOne
    @JoinColumn(name="idItems", nullable=false)
    private Items item;

    @ManyToOne
    @JoinColumn(name="idVendor", nullable=false)
    private Supliers vendor;

}


