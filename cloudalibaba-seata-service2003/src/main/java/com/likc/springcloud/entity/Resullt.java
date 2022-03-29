package com.likc.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author likc
 * @date 2022/3/29
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resullt<T> {

    private Integer code;

    private String message;

    private T data;

    public Resullt(Integer code, String message) {
        this(code, message, null);
    }
}
