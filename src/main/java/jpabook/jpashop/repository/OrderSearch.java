package jpabook.jpashop.repository;

import jpabook.jpashop.domain.OrderStauts;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {

    private String memberName; //회원이름
    private OrderStauts orderStauts; //주문 상태(ORDER, CANCEL)
}
