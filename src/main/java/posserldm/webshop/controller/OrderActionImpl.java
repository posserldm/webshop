package posserldm.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import posserldm.webshop.model.MyOrder;
import posserldm.webshop.service.OrderService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderActionImpl implements OrderAction {

    @Autowired
    private OrderService orderService;

    @Override
    @RequestMapping(value = "/deleteOrder", method = RequestMethod.GET)
    public String deleteOrder(HttpSession session, MyOrder order)  {
        orderService.delete(order);
        List<MyOrder> orders = (List<MyOrder>)session.getAttribute("orders");
        for (MyOrder myOrder : orders) {
            if (myOrder.getOrderId() == order.getOrderId()) {
                orders.remove(myOrder);
                break;
            }
        }
        session.setAttribute("orders", orders);
        return "redirect:/comeBack";
    }

    @RequestMapping("/comeBack")
    public String comeBack() {
        return "orderList";
    }

    @Override
    public String visitOrder() {
        return null;
    }

    @Override
    public String createOrder() {
        return null;
    }
}
