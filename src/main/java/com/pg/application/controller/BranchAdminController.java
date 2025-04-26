package com.pg.application.controller;

import com.pg.application.data.BranchRequest;
import com.pg.application.data.RoomSummary;
import com.pg.application.data.RoomSummaryResponse;
import com.pg.application.entity.BranchAdminEntity;
import com.pg.application.service.BranchAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/branchadmin")
public class BranchAdminController {

    @Autowired
    private BranchAdminService branchAdminService;

    // Create a new BranchAdmin


    // Get all BranchAdmins
    @GetMapping("/all")
    public ResponseEntity<List<BranchAdminEntity>> getAllBranchAdmins() {
        List<BranchAdminEntity> branchAdmins = branchAdminService.getAllBranchAdmins();
        return ResponseEntity.ok(branchAdmins);
    }

    // Get a BranchAdmin by ID
    @GetMapping("/{id}")
    public ResponseEntity<BranchAdminEntity> getBranchAdminById(@PathVariable int id) {
        Optional<BranchAdminEntity> branchAdmin = branchAdminService.getBranchAdminById(id);
        return branchAdmin.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update a BranchAdmin by ID
    @PutMapping("/update/{id}")
    public ResponseEntity<BranchAdminEntity> updateBranchAdmin(@PathVariable int id, @RequestBody BranchAdminEntity branchAdminEntity) {
        BranchAdminEntity updatedBranchAdmin = branchAdminService.updateBranchAdmin(id, branchAdminEntity);
        return updatedBranchAdmin != null
          ? ResponseEntity.ok(updatedBranchAdmin)
          : ResponseEntity.notFound().build();
    }

    // Delete a BranchAdmin by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBranchAdmin(@PathVariable int id) {
        boolean isDeleted = branchAdminService.deleteBranchAdmin(id);
        return isDeleted
          ? ResponseEntity.ok("Branch Admin deleted successfully")
          : ResponseEntity.notFound().build();
    }

}