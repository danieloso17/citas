package com.uniminuto.citas.model;

import lombok.Data;

import java.util.List;

@Data
public class Cita {
    public int status;
    public List<Value> value;

}
