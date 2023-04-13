package com.example.demo.common.tiktok.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TiktokOrderDetailsModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("order_list")
    private List<TiktokOrderModel> orderList;
}
