package com.unir.grupo15.operador.model.pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PlanDto {
    private Long id;
    private String name;
    private String description;
}
