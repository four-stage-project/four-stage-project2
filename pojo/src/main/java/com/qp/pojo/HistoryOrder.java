package com.qp.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class HistoryOrder implements Serializable {
    private String historyId;

    private String buyerId;

    private String carId;

    private String sellerId;

    private static final long serialVersionUID = 1L;
}