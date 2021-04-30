package com.bitbox.BITBOX.DAO;


import com.bitbox.BITBOX.models.Vendor;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface VendorDAO extends CrudRepository<Vendor, BigInteger> {
    Vendor findByVendorId(BigInteger id);
}
