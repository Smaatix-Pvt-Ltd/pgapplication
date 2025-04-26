package com.pg.application.repository;

import com.pg.application.entity.BranchAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchAdminRepository extends JpaRepository<BranchAdminEntity, Integer> {
}
