package net.avalara.avatax.rest.client.serializer;

import com.google.gson.*;

import java.lang.reflect.Type;

public class JsonSerializer<T> {
    private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

    public static String SerializeObject(Object obj) {
        return gson.toJson(obj);
    }

    public static Object DeserializeObject(String json, Type type) {
        return gson.fromJson(json, type);
    }
}
