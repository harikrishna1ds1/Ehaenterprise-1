package com.elephant.service.order;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.elephant.domain.order.OrderDomain;
import com.elephant.model.address.AddressModel;
import com.elephant.model.order.OrderModel;
import com.elephant.model.orderdetail.OrderDetailModel;
import com.elephant.model.payment.PaymentModel;
import com.elephant.response.Response;

public interface OrderService {

	public Response createOrder(PaymentModel paymentModel) throws IOException ;

	public List<OrderModel> getAllCustomerOrders(String email);

	public List<OrderModel> getAllOrders();

	public double totalOrdersAmountPerDay(Date orderDate);

	public Response cancelOrder(long orderId);

	public List<OrderModel> getOrdersByDate(Date orderDate);

	public List<OrderModel> totalOrdersFromDateToParticularDate(Date fromDate, Date toDate);

	public Response deleteAllOrders();

	public List<OrderDetailModel> getOrderDetailsByOrderId(long orderId);

	public AddressModel getAddressByOrderId(long orderId);

	public Response updateOrderStatus(OrderModel orderModel);

	public OrderModel getOrderByOrderId(long orderId);

	public ByteArrayInputStream citiesReport(String string);

}
