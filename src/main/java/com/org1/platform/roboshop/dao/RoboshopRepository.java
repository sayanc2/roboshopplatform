package com.org1.platform.roboshop.dao;

import com.org1.platform.roboshop.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoboshopRepository extends JpaRepository<Inventory,String> {
}
