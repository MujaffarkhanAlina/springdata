package com.practice.dto;



import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    @NotNull
    private int employeeId;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
     @NotNull
    private Date timeStamp;


}
