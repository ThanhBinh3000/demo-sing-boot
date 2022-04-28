package com.codegym.demospringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductForm {
    private Long id;

    @NotEmpty(message = "khong duoc phep de trong")
    @Size(min = 5, max = 20, message = "Ten san pham tu 5 den 20 ki tu")
    private String name;

    @NotNull
    private double price;

    @NotBlank
    private String description;

    private MultipartFile image;

    private Category category;

}