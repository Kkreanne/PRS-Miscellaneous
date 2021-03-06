package com.capstone.vendor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {
	Vendor findByCodeAndName(String code, String name);

}
