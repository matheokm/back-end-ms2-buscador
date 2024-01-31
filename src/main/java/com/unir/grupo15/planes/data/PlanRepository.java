package com.unir.grupo15.planes.data;

import com.unir.grupo15.planes.model.pojo.Plan;
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
