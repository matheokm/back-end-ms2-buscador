package com.unir.grupo15.planes.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unir.grupo15.planes.data.PlanRepository;
import com.unir.grupo15.planes.model.pojo.Plan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class PlanServiceImpl implements PlanService{
    @Autowired
    private PlanRepository planRepositoryrepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public List<Plan> getPlans() {

        List<Plan> products = planRepositoryrepository.getPlans();
        return products.isEmpty() ? null : products;
    }

}
