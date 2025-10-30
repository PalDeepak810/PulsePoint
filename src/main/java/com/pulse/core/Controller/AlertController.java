package com.pulse.core.Controller;

import com.pulse.core.Model.AlertRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {
    @PostMapping
    public ResponseEntity<?> createAlert(@Validated @RequestBody AlertRequest alertRequest){
        return ResponseEntity.ok(
                "Alert received from"+alertRequest.getSource()+
                        "With message"+alertRequest.getMessage()
        );
    }
}
