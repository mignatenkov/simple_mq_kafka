package com.korfax.simple_mq_kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor // required for json deserialization
@AllArgsConstructor
public class SimpleEntity implements Serializable {

    private String value;

}
