package com.efuturesworld.demo.service;

import com.efuturesworld.dto.response.model.Model;
import com.efuturesworld.service.OpenAIService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class AiService {

    private final OpenAIService openAIService;

    public AiService(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    public List<Model> getModels(){
        CompletableFuture<List<Model>> listCompletableFuture = openAIService.listModels();
        List<Model> join = listCompletableFuture.join();
        return join;
    }
}
