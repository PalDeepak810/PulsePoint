package com.pulse.core.Controller;

import com.pulse.core.Model.HealthStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

@RestController
public class HealthController {

    @GetMapping("api/health")
    public HealthStatus getHealthStatus(){
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        double cpuLoad = osBean.getSystemLoadAverage();
        long freeMemory = Runtime.getRuntime().freeMemory()/(1024*1024);
        long totalMemory = Runtime.getRuntime().totalMemory()/(1024*1024);

        return new HealthStatus("Up",cpuLoad,freeMemory,totalMemory);
    }
}
