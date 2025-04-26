
package com.pg.application.service;

import com.pg.application.data.RoomSummary;
import com.pg.application.data.RoomSummaryResponse;
import com.pg.application.entity.BranchAdminEntity;
import com.pg.application.entity.RoomEntity;
import com.pg.application.repository.BranchAdminRepository;
import com.pg.application.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BranchAdminService {

    @Autowired
    private BranchAdminRepository branchAdminRepository;

    @Autowired
    private RoomRepository roomRepository;

    // Create a new BranchAdmin
    public BranchAdminEntity createBranchAdmin(BranchAdminEntity branchAdminEntity) {
        return branchAdminRepository.save(branchAdminEntity);
    }

    // Read all BranchAdmins
    public List<BranchAdminEntity> getAllBranchAdmins() {
        return branchAdminRepository.findAll();
    }

    // Read a single BranchAdmin by ID
    public Optional<BranchAdminEntity> getBranchAdminById(int id) {
        return branchAdminRepository.findById(id);
    }

    // Update an existing BranchAdmin
    public BranchAdminEntity updateBranchAdmin(int id, BranchAdminEntity branchAdminEntity) {
        if (branchAdminRepository.existsById(id)) {
            branchAdminEntity.setBranchId(id);
            return branchAdminRepository.save(branchAdminEntity);
        } else {
            return null; // Or throw an exception if preferred
        }
    }

    // Delete a BranchAdmin by ID
    public boolean deleteBranchAdmin(int id) {
        if (branchAdminRepository.existsById(id)) {
            branchAdminRepository.deleteById(id);
            return true;
        }
        return false;
    }}