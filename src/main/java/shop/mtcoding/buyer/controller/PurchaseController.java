package shop.mtcoding.buyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.buyer.model.Product;
import shop.mtcoding.buyer.model.ProductRepository;
import shop.mtcoding.buyer.model.PurchaseRepository;

@Controller
public class PurchaseController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    PurchaseRepository purchaseRepository;

    @GetMapping(value = "purchase/{id}/orderForm")
    public String order(@PathVariable int id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "purchase/orderForm";
    }

    @GetMapping("/api/product/{id}/orderForm")
    @ResponseBody
    public Product apiFindOneproduct(@PathVariable int id) {
        Product product = productRepository.findById(id);
        return product;
    }

    @GetMapping(value = "product/{productId}/order")
    public String insert(@PathVariable int productId, int userId, int qty) {

        return "";
    }

}
