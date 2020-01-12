package com.motherbuy;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BasePojo {

    private String name;

    private Integer age;

    private Long teamId;

    private BasePojo basePojo;

}
