package com.bitbox.BITBOX.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "ITEMS")
public class Items {
        @Id
        @GeneratedValue
        private BigInteger itemsId;

        @NonNull
        private String description;

        @NonNull
        private Float price;

        @NonNull
        private String state;

        @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
        private List<Supliers> suppliers;

        @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
        private List<PriceProductsReduction> priceReductions;

        @NonNull
        private LocalDate creationDate;

        @NonNull
        private String creator;
}


