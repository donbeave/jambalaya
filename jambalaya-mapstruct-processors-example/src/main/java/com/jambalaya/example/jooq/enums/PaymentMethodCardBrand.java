/*
 * Copyright 2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jambalaya.example.jooq.enums;

import com.jambalaya.example.jooq.DefaultSchema;
import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public enum PaymentMethodCardBrand implements EnumType {

    VISA("VISA"),

    MASTERCARD("MASTERCARD");

    private final String literal;

    private PaymentMethodCardBrand(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public String getName() {
        return "payment_method_card_brand";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
