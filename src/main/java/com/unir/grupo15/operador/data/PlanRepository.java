package com.unir.grupo15.operador.data;

import com.unir.grupo15.operador.model.pojo.Plan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PlanRepository {

    private final PlanJpaRepository repository;

    public List<Plan> getPlans() {
        return repository.findAll();
    }
}
