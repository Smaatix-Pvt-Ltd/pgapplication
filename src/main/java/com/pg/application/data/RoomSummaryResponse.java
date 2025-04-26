package com.pg.application.data;

import lombok.Data;
import java.util.List;

@Data
public class RoomSummaryResponse {
    private int branchId;
    private List<RoomSummary> roomSummaries;

    // Getters and Setters
    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public List<RoomSummary> getRoomSummaries() {
        return roomSummaries;
    }

    public void setRoomSummaries(List<RoomSummary> roomSummaries) {
        this.roomSummaries = roomSummaries;
    }
}
