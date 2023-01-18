package shop.mtcoding.buyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.buyer.model.Product;
import shop.mtcoding.buyer.model.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping({ "/", "/product" })
    public String home(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);
        return "product/list";
    }

    @GetMapping("/api/product")
    @ResponseBody
    public List<Product> apiFindAllproduct() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    @GetMapping(value = "/product/{id}")
    public String productDetail(@PathVariable int id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "product/detail";
    }

    @GetMapping("/api/product/{id}")
    @ResponseBody
    public Product apiFindOneproduct(@PathVariable int id) {
        Product product = productRepository.findById(id);
        return product;
    }

    @PostMapping(value = "/order/{id}")
    public String order(@PathVariable int id, int qty, int orderqty) {
        int result = productRepository.updateQtyByOrder(id, qty, orderqty);
        if (result == 1) {
            return "redirect:/product/";
        } else {
            return "redirect:/product/orderForm";
        }

    }

}
