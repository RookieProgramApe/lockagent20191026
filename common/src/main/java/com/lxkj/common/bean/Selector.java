package com.lxkj.common.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Selector implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String value;
}