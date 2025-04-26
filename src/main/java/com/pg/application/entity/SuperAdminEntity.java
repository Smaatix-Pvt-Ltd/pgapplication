package com.pg.application.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "superadmin")
public class SuperAdminEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "superadminid")
  private int Id;

  @NotBlank(message = "Name is mandatory")
  private String name;

  @NotBlank(message = "Contact number is mandatory")
  private String contactNo;

  @NotBlank(message = "Address is mandatory")
  private String address;

  @NotBlank(message = "Email is mandatory")
  @Email(message = "Email should be valid")
  private String email;

  @NotBlank(message = "Status is mandatory")
  private String status;

  @Column(name = "created_at", updatable = false)
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @OneToMany(mappedBy = "superAdmin", cascade = CascadeType.ALL)
  private List<BranchAdminEntity> branchAdminEntities;


  @Column(nullable = false)
  private String password;
  // Getters and Setters


  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public List<BranchAdminEntity> getBranchAdminEntities() {
    return branchAdminEntities;
  }

  public void setBranchAdminEntities(List<BranchAdminEntity> branchAdminEntities) {
    this.branchAdminEntities = branchAdminEntities;
  }
}
