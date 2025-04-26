package com.pg.application.data;

import lombok.Data;

@Data
public class BranchRequest {
    private int branchId;

    // Getters and Setters
    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
