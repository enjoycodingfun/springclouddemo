package com.motherbuy;

import lombok.Data;

@Data
public class BasePojo {

    private String name;

    private Integer age;

    private Long teamId;

    private BasePojo basePojo;

}
