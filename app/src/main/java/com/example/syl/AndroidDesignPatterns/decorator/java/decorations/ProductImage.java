/*
 * Copyright (C) 2018 Sylvia Domenech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.syl.AndroidDesignPatterns.decorator.java.decorations;

import com.example.syl.AndroidDesignPatterns.decorator.java.Product;
import com.example.syl.AndroidDesignPatterns.decorator.java.ProductDecorator;

public class ProductImage extends ProductDecorator{

    public ProductImage(Product product) {
        super(product);
    }

    @Override
    public String makeProduct() {
        return super.makeProduct() + " with image";
    }
}