package com.example.msrestaurant.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableRequest {
    String tableType;
    int chairs;
    String roomType;
}
