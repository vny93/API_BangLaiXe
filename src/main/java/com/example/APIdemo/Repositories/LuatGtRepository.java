package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.LuatGt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LuatGtRepository extends JpaRepository<LuatGt, String> {
}