package com.pg.application.service;

import com.pg.application.entity.BranchAdminEntity;
import com.pg.application.entity.SuperAdminEntity;
import com.pg.application.repository.BranchAdminRepository;
import com.pg.application.repository.SuperAdminRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperAdminService {

    @Autowired
    private SuperAdminRepository superAdminRepository;

    @Autowired
    private BranchAdminRepository branchAdminRepository;

    // Create or Update a SuperAdmin
    public SuperAdminEntity createOrUpdateSuperAdmin(SuperAdminEntity superAdmin) {
        return superAdminRepository.save(superAdmin);
    }

    // Get SuperAdmin by ID
    public Optional<SuperAdminEntity> getSuperAdminById(int id) {
        return superAdminRepository.findById(id);
    }

    // Get all SuperAdmins
    public List<SuperAdminEntity> getAllSuperAdmins() {
        return superAdminRepository.findAll();
    }

    // Delete a SuperAdmin by ID
    public void deleteSuperAdmin(int id) {
        superAdminRepository.deleteById(id);
    }

    public boolean login(String email, String password) {
        Optional<SuperAdminEntity> superAdmin = superAdminRepository.findByEmail(email);
        return superAdmin.map(admin -> admin.getPassword().equals(password)).orElse(false);
    }

//    public BranchAdminEntity createBranchAdmin(BranchAdminEntity branchAdminEntity) {
//
//
//        return branchAdminRepository.save(branchAdminEntity);
//    }

    public SuperAdminEntity getSuperAdminByBranchId(int branchId) {
        return superAdminRepository.findByBranchId(branchId);
    }


    public String createBranchAdmin(int superadminid,BranchAdminEntity branchAdminEntity) {
        SuperAdminEntity superAdminEntity=superAdminRepository.findById(superadminid)
                .orElseThrow(() -> new EntityNotFoundException("Super Admin not found for id: " + superadminid));
        superAdminEntity.getBranchAdminEntities().add(branchAdminEntity);
        branchAdminEntity.setSuperAdmin(superAdminEntity);
        superAdminRepository.save(superAdminEntity);
        return "Entity Saved Successfully";
    }
}

