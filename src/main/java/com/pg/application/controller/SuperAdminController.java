package com.pg.application.controller;

import com.pg.application.entity.BranchAdminEntity;
import com.pg.application.entity.SuperAdminEntity;
import com.pg.application.service.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/superadmin")
public class SuperAdminController {

    @Autowired
    private SuperAdminService superAdminService;

    // Create or Update SuperAdmin
    @PostMapping("/create")
    public ResponseEntity<SuperAdminEntity> createOrUpdateSuperAdmin(@RequestBody SuperAdminEntity superAdmin) {
        SuperAdminEntity savedSuperAdmin = superAdminService.createOrUpdateSuperAdmin(superAdmin);
        return ResponseEntity.ok(savedSuperAdmin);
    }

    // Get SuperAdmin by ID
    @GetMapping("/get/{id}")
    public ResponseEntity<SuperAdminEntity> getSuperAdminById(@PathVariable int id) {
        Optional<SuperAdminEntity> superAdmin = superAdminService.getSuperAdminById(id);
        return superAdmin.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get all SuperAdmins
    @GetMapping("/get")
    public ResponseEntity<List<SuperAdminEntity>> getAllSuperAdmins() {
        List<SuperAdminEntity> superAdmins = superAdminService.getAllSuperAdmins();
        return ResponseEntity.ok(superAdmins);
    }

    // Delete SuperAdmin by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSuperAdmin(@PathVariable int id) {
        superAdminService.deleteSuperAdmin(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        boolean isAuthenticated = superAdminService.login(email, password);
        if (isAuthenticated) {
            return ResponseEntity.ok("Successfully logged in");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }

    }

    @PostMapping("/branchadmin/create")
    public ResponseEntity<BranchAdminEntity> createBranchAdmin(@RequestBody BranchAdminEntity branchAdminEntity) {
        BranchAdminEntity createdBranchAdmin = superAdminService.createBranchAdmin(branchAdminEntity);
        return ResponseEntity.ok(createdBranchAdmin);
    }
}