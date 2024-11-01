package ru.Cat;

import java.lang.reflect.Field;

public class FieldNullifier {

    public static void nullifyFields(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (!field.getType().isPrimitive()) {
                field.setAccessible(true);
                try {
                    field.set(obj, null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
