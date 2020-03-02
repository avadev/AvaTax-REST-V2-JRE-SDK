package net.avalara.avatax.rest.client.serializer;

import java.lang.reflect.Type;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import java.text.DateFormat;
import java.text.SimpleDateFormat;




public class JsonSerializer<T> {
    private static ObjectMapper objectMapper = new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

    public static String SerializeObject(Object obj){
        String str = null;
        try {
            str = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e){}
        return str;

    }

    public static Object DeserializeObject(String json, TypeReference type){
        Object obj = null;

        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            objectMapper.setDateFormat(df);
            obj = objectMapper.readValue(json, type);
        } catch (JsonProcessingException e){}

        return obj;

    }

    public static Object DeserializeObject(String json, Class type){
        Object obj = null;

        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            objectMapper.setDateFormat(df);
            obj = objectMapper.readValue(json, type);
        } catch (JsonProcessingException e){}

        return obj;
    }
}
