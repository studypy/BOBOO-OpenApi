package io.boboo.api.client.domain.option.request;


import io.boboo.api.client.domain.account.OrderSide;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OptionTradeRequest {

    private String symbol;

    private Long fromId;

    private Long toId;

    private Integer limit;

    private OrderSide orderSide;

    private Long recvWindow;

    private Long timestamp;
}
