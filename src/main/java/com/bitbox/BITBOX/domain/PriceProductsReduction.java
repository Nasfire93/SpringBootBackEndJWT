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
import java.time.LocalDate;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "PRICE_REDUCTION")
public class PriceProductsReduction {

    @Id
    @GeneratedValue
    private BigInteger itemsId;

    @NonNull
    private float reducedPrice;

    @NonNull
    private LocalDate startDate;

    @NonNull
    private LocalDate endDate;

}
