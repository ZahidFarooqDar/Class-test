package com.zahid.mapping.repository;

import com.zahid.mapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
