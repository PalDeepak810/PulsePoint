package com.pulse.core.Model;

public class HealthStatus {
    private String status;
    private Double cpuLoad;
    private long freeMemory;
    private long totalMemory;

    public HealthStatus(String status, Double cpuLoad, long freeMemory, long totalMemory) {
        this.status = status;
        this.cpuLoad = cpuLoad;
        this.freeMemory = freeMemory;
        this.totalMemory = totalMemory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(Double cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(long freeMemory) {
        this.freeMemory = freeMemory;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(long totalMemory) {
        this.totalMemory = totalMemory;
    }
}
