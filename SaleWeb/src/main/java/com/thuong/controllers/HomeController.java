/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuong.controllers;

import com.thuong.pojo.Category;
import com.thuong.pojo.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author thuon
 */
@Controller
public class HomeController {

    // Gắn Mapping
    @RequestMapping("/")
    public String index(Model model,
            @RequestParam(value = "kw", defaultValue = "") String kw) {
        List<Category> cates = new ArrayList<>();
        cates.add(new Category(1, "Mobile"));
        cates.add(new Category(1, "Tablet"));
        cates.add(new Category(1, "Desktop"));

        // ĐỔ dữ liệu ra Adtribute
        model.addAttribute("categories", cates);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Ipad Pro", "https://www.google.com/url?sa=i&url=https%3A%2F%2Ftienthanhluxury.com%2Fproducts%2Fsamsung-galaxy-tab-s8-ultra-5g-2022&psig=AOvVaw3tTeq8UC6Bg1qbTC57QG4h&ust=1678727357970000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCIDi6_Dw1v0CFQAAAAAdAAAAABAJ", 20000000l));
        products.add(new Product(2, "galaxy tab s8", "https://www.google.com/search?q=galaxy+tab+s8&rlz=1C1GCEA_enVN992VN992&sxsrf=AJOqlzUE_I1Bc86Uz6P5yaDUo_JCEwjJeg:1678639922928&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiJ976C7db9AhUZ0GEKHauCDFoQ_AUoAXoECAEQAw&biw=1536&bih=746&dpr=1.25#imgrc=iCt06pVQqhHCgM", 22000000l));
        products.add(new Product(3, "gagalaxy tab s8 ultra", "https://www.google.com/search?q=galaxy+tab+s8&rlz=1C1GCEA_enVN992VN992&sxsrf=AJOqlzUE_I1Bc86Uz6P5yaDUo_JCEwjJeg:1678639922928&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiJ976C7db9AhUZ0GEKHauCDFoQ_AUoAXoECAEQAw&biw=1536&bih=746&dpr=1.25#imgrc=WwlGy3iv6feNmM", 50000000l));
        products.add(new Product(4, "Samsung", "https://www.google.com/search?q=%C4%91i%E1%BB%87n+tho%E1%BA%A1i+samsung&rlz=1C1GCEA_enVN992VN992&sxsrf=AJOqlzXs3wA08mUKiXvQk8mrEjlqWVu3UQ:1678640092290&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjgkKDT7db9AhWOUN4KHZl4BhYQ_AUoAXoECAEQAw&biw=1536&bih=746&dpr=1.25#imgrc=pTk9OkfVUOeOMM", 27000000l));
        products.add(new Product(5, "Ipad Pro", "https://www.google.com/search?q=ipad+pro&rlz=1C1GCEA_enVN992VN992&sxsrf=AJOqlzXhWAwX7cq12HwTRl6UN5EdQTmp2A:1678639835642&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjOw-_Y7Nb9AhXFdt4KHXkdDQAQ_AUoAXoECAEQAw&biw=1536&bih=746&dpr=1.25#imgrc=ffighC4ExWs3EM", 25000000l));

        if (kw != null && !kw.isEmpty()) 
            products = products.stream().filter(p->p.getName().contains(kw)).collect(Collectors.toList());
        
        model.addAttribute("products", products);
        return ("index");
    }
}
