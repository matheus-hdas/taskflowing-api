package com.matheushdas.taskflowingapi.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record UpdateTaskRequest(
        @JsonProperty("id") UUID id,
        @JsonProperty("name") String name,
        @JsonProperty("description") String description
) {}
