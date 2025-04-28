package com.pg.application.repository;

import com.pg.application.entity.SuperAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SuperAdminRepository extends JpaRepository<SuperAdminEntity,Integer> {
  Optional<SuperAdminEntity> findByEmail(String email);


  @Query("SELECT s FROM SuperAdminEntity s JOIN s.branchAdminEntities b WHERE b.branchId = :branchId")
  SuperAdminEntity findByBranchId(@Param("branchId") int branchId);

}