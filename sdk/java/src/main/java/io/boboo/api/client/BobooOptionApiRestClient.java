package io.boboo.api.client;

import java.util.List;

import io.boboo.api.client.domain.account.request.CancelOrderRequest;
import io.boboo.api.client.domain.option.OptionMatchResult;
import io.boboo.api.client.domain.option.OptionOrderResult;
import io.boboo.api.client.domain.option.PositionResult;
import io.boboo.api.client.domain.option.SettlementResult;
import io.boboo.api.client.domain.option.TokenOptionResult;
import io.boboo.api.client.domain.option.request.OptionHistoryOrderRequest;
import io.boboo.api.client.domain.option.request.OptionOpenOrderRequest;
import io.boboo.api.client.domain.option.request.OptionOrderRequest;
import io.boboo.api.client.domain.option.request.OptionPositionRequest;
import io.boboo.api.client.domain.option.request.OptionSettlementRequest;
import io.boboo.api.client.domain.option.request.OptionTradeRequest;
import io.boboo.api.client.domain.option.request.OptionsRequest;

public interface BobooOptionApiRestClient {

    /**
     * Get options
     *
     * @param request options request parameters
     * @return options
     */
    List<TokenOptionResult> getOptions(OptionsRequest request);

    /**
     * Send in a new order.
     *
     * @param request the new order to submit.
     * @return a response containing details about the newly placed order.
     */
    OptionOrderResult newOptionOrder(OptionOrderRequest request);

    /**
     * Cancel an active order.
     *
     * @param cancelOrderRequest order status request parameters
     * @return order result
     */
    OptionOrderResult cancelOptionOrder(CancelOrderRequest cancelOrderRequest);

    /**
     * Get option open orders.
     *
     * @param orderRequest order request parameters
     * @return a list of all account open orders on a symbol.
     */
    List<OptionOrderResult> getOptionOpenOrders(OptionOpenOrderRequest orderRequest);

    /**
     * Get option history orders.
     *
     * @param orderRequest history order request parameters
     * @return history orders
     */
    List<OptionOrderResult> getOptionHistoryOrders(OptionHistoryOrderRequest orderRequest);

    /**
     * Get option my trades.
     *
     * @param request trade request parameters
     * @return trades
     */
    List<OptionMatchResult> getOptionMyTrades(OptionTradeRequest request);

    /**
     * Get option positions.
     *
     * @param request position request parameters
     * @return positions
     */
    List<PositionResult> getOptionPositions(OptionPositionRequest request);


    /**
     * Get option settlements.
     *
     * @param request settlement request parameters
     * @return settlements
     */
    List<SettlementResult> getOptionSettlements(OptionSettlementRequest request);
}
