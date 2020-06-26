package posserldm.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import posserldm.webshop.model.MyOrder;
import posserldm.webshop.model.User;
import posserldm.webshop.service.OrderService;
import posserldm.webshop.service.UserService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class UserActionImpl implements UserAction  {

    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/login")
    public String login(HttpSession session, @Valid User user) {
        if (userService.login(user)) {
            List<MyOrder> orders = orderService.visitByUsername(user.getUsername());
            session.setAttribute("user", user);
            session.setAttribute("orders", orders);
            return "redirect:/orderList";
        }
        return "login";
    }

    @RequestMapping("/orderList")
    public String orderList() {
        return "orderList";
    }

    @Override
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        session.removeAttribute("orders");
        return "login";
    }

    @Override
    public String register() {
        return null;
    }

    @Override
    public String destroyUser() {
        return null;
    }

    @Override
    public String updateInformation() {
        return null;
    }

    @Override
    public String addAddress() {
        return null;
    }

    @Override
    public String updateAddress() {
        return null;
    }

    @Override
    public String deleteAddress() {
        return null;
    }
}
