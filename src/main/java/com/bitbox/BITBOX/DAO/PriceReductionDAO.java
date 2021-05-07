package com.bitbox.BITBOX.DAO;

import com.bitbox.BITBOX.models.Items;
import com.bitbox.BITBOX.models.PriceReduction;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface PriceReductionDAO extends CrudRepository<PriceReduction, BigInteger> {
}