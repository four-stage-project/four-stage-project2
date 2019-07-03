package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class Fav implements Serializable {
    private String uid;

    private String carId;

    private static final long serialVersionUID = 1L;
}