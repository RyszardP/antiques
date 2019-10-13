package com.ryszard;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ryszard.domain.spring.Owner;

import java.io.File;
import java.io.IOException;

public class Convertrer {
    private final static String baseFile = "owner.json";

    public static void toJSON(Owner owner) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), owner);
        System.out.println("json file created");
    }

    public static Owner toJavaObject() throws  IOException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), Owner.class);
    }
}
