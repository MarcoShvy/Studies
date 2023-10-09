package aula001;

import java.util.Date;

public class Order {

        private Integer order;
        private Date moment;
        private OrderStatus status;

    public Order(Integer order, Date moment, OrderStatus status) {
        this.order = order;
        this.moment = moment;
        this.status = status;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order=" + order +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
