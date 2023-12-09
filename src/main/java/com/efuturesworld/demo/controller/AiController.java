package com.efuturesworld.demo.controller;

import com.efuturesworld.demo.service.AiService;
import com.efuturesworld.dto.response.model.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class AiController {
    private final AiService service;

    public AiController(AiService service) {
        this.service = service;
    }

    @GetMapping("/api/v1/models")
    public ResponseEntity<List<Model>> getModels(){
        List<Model> models = service.getModels();
        return new ResponseEntity<>(models, HttpStatus.OK);
    }

}
