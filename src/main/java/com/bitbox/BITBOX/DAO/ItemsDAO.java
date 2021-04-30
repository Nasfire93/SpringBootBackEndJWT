package com.bitbox.BITBOX.DAO;

import com.bitbox.BITBOX.models.Items;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface ItemsDAO extends CrudRepository<Items, BigInteger> {
    Items findByItemsId(BigInteger id);
    Items findTopByOrderByItemsIdDesc();
}
