package com.pg.application.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "branchadmin", uniqueConstraints = {@UniqueConstraint(columnNames = {"branchName", "organizationId"}), @UniqueConstraint(columnNames = {"contactNumber"}), @UniqueConstraint(columnNames = {"email"})})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchAdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branchid")
    private int branchId;

    @Column(nullable = false, unique = true)
    private String branchName;


    @ManyToOne
    @JoinColumn(name = "superadmin_id")
    private SuperAdminEntity superAdmin;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<RoomEntity> rooms;

    @Column(nullable = false)
    private int noOfRooms;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = false)
    private String districtName;

    @Column(nullable = false)
    private String stateName;

    @Column(nullable = false)
    private Integer totalOccupiedRooms;

    @Column(nullable = false)
    private Integer totalEmptyRooms;

    @Column(nullable = false)
    private String openTime;

    @Column(nullable = false)
    private String closeTime;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private int noOfCookNeed;

    @Column(nullable = false)
    private int noOfAvailableCooks;

    @Column(nullable = false)
    private int noOfMaidNeed;

    @Column(nullable = false)
    private int noOfAvailableMaids;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String ownerName;

    @Column(nullable = false, unique = true)
    private String contactNumber;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private Double securityDeposit;

    @Column(nullable = false)
    private String rentPaymentMode;

    @Column(nullable = false)
    private Boolean hasWiFi;

    @Column(nullable = false)
    private Boolean hasLaundry;

    @Column(nullable = false)
    private Boolean hasFoodService;

    @Column(nullable = false)
    private Boolean hasParking;

    @Column(nullable = false)
    private Boolean hasACRooms;

    @Column(nullable = false)
    private Boolean allowsVisitors;

    @Column(nullable = false)
    private Boolean allowsLateEntry;

    @Column(nullable = false)
    private Boolean allowsSmoking;

    @Column(nullable = false)
    private Boolean allowsDrinking;


    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public SuperAdminEntity getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(SuperAdminEntity superAdmin) {
        this.superAdmin = superAdmin;
    }

    public List<RoomEntity> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomEntity> rooms) {
        this.rooms = rooms;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Integer getTotalOccupiedRooms() {
        return totalOccupiedRooms;
    }

    public void setTotalOccupiedRooms(Integer totalOccupiedRooms) {
        this.totalOccupiedRooms = totalOccupiedRooms;
    }

    public Integer getTotalEmptyRooms() {
        return totalEmptyRooms;
    }

    public void setTotalEmptyRooms(Integer totalEmptyRooms) {
        this.totalEmptyRooms = totalEmptyRooms;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNoOfCookNeed() {
        return noOfCookNeed;
    }

    public void setNoOfCookNeed(int noOfCookNeed) {
        this.noOfCookNeed = noOfCookNeed;
    }

    public int getNoOfAvailableCooks() {
        return noOfAvailableCooks;
    }

    public void setNoOfAvailableCooks(int noOfAvailableCooks) {
        this.noOfAvailableCooks = noOfAvailableCooks;
    }

    public int getNoOfMaidNeed() {
        return noOfMaidNeed;
    }

    public void setNoOfMaidNeed(int noOfMaidNeed) {
        this.noOfMaidNeed = noOfMaidNeed;
    }

    public int getNoOfAvailableMaids() {
        return noOfAvailableMaids;
    }

    public void setNoOfAvailableMaids(int noOfAvailableMaids) {
        this.noOfAvailableMaids = noOfAvailableMaids;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(Double securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public String getRentPaymentMode() {
        return rentPaymentMode;
    }

    public void setRentPaymentMode(String rentPaymentMode) {
        this.rentPaymentMode = rentPaymentMode;
    }

    public Boolean getHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(Boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public Boolean getHasLaundry() {
        return hasLaundry;
    }

    public void setHasLaundry(Boolean hasLaundry) {
        this.hasLaundry = hasLaundry;
    }

    public Boolean getHasFoodService() {
        return hasFoodService;
    }

    public void setHasFoodService(Boolean hasFoodService) {
        this.hasFoodService = hasFoodService;
    }

    public Boolean getHasParking() {
        return hasParking;
    }

    public void setHasParking(Boolean hasParking) {
        this.hasParking = hasParking;
    }

    public Boolean getHasACRooms() {
        return hasACRooms;
    }

    public void setHasACRooms(Boolean hasACRooms) {
        this.hasACRooms = hasACRooms;
    }

    public Boolean getAllowsVisitors() {
        return allowsVisitors;
    }

    public void setAllowsVisitors(Boolean allowsVisitors) {
        this.allowsVisitors = allowsVisitors;
    }

    public Boolean getAllowsLateEntry() {
        return allowsLateEntry;
    }

    public void setAllowsLateEntry(Boolean allowsLateEntry) {
        this.allowsLateEntry = allowsLateEntry;
    }

    public Boolean getAllowsSmoking() {
        return allowsSmoking;
    }

    public void setAllowsSmoking(Boolean allowsSmoking) {
        this.allowsSmoking = allowsSmoking;
    }

    public Boolean getAllowsDrinking() {
        return allowsDrinking;
    }

    public void setAllowsDrinking(Boolean allowsDrinking) {
        this.allowsDrinking = allowsDrinking;
    }
}