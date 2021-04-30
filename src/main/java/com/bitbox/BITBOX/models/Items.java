package com.bitbox.BITBOX.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.omg.CORBA.portable.IDLEntity;

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
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private BigInteger itemsId;

        @NonNull
        private String description;

        @NonNull
        private Float price;

        @NonNull
        private String state;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "items")
        @JsonBackReference
        private Vendor vendor;

        @OneToMany(fetch = FetchType.EAGER, mappedBy = "item")
        @JsonBackReference
        private List<PriceReduction> priceReductions;

        @NonNull
        private LocalDate creationDate;

        @NonNull
        private String creator;
}


