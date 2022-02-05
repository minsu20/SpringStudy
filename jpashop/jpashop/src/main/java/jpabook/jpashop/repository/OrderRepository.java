package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(jpabook.jpashop.domain.Order order){
        em.persist(order);
    }

    public jpabook.jpashop.domain.Order findOne(Long id){
        return em.find(Order.class, id);
    }

//    public List<Order> findAll(OrderSearch orderSearch){}
}
