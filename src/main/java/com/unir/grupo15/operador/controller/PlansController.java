package com.unir.grupo15.operador.controller;

import com.unir.grupo15.operador.model.pojo.Plan;
import com.unir.grupo15.operador.service.PlanService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Plans Controller", description = "Microservicio encargado de exponer operaciones CRUD sobre planes alojados en una base de datos en memoria.")
public class PlansController {

    private final PlanService planService;

    @GetMapping("/plans")
    @Operation(
            operationId = "Obtener productos",
            description = "Operacion de lectura",
            summary = "Se devuelve una lista de todos los productos almacenados en la base de datos.")
    @ApiResponse(
            responseCode = "200",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Plan.class)))
    public ResponseEntity<List<Plan>> getProducts(
            @RequestHeader Map<String, String> headers) {

        log.info("headers: {}", headers);
        List<Plan> products = planService.getPlans();

        return ResponseEntity.ok(Objects.requireNonNullElse(products, Collections.emptyList()));
    }
}
