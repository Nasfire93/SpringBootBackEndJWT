package com.bitbox.BITBOX.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "PRICE_REDUCTION")
public class PriceReduction {

    @Id
    @GeneratedValue
    private BigInteger priceReductionId;

    @NonNull
    private String creator;

    @NonNull
    private float reducedprice;

    @NonNull
    private LocalDate datestart;

    @NonNull
    private LocalDate dateend;

    @ManyToOne
    @JoinColumn(name = "idItems")
    @JsonBackReference
    private Items item;

}
