package tools.utils;

import net.serenitybdd.core.Serenity;

import java.util.ArrayList;
import java.util.List;

public class SerenitySessionUtils {
    public static void saveObjectInSerenitySessionList(String key,Object object){
        if(!Serenity.getCurrentSession().containsKey(key)){
            Serenity.getCurrentSession().put(key,new ArrayList<>());
        }
        ((List<Object>)Serenity.getCurrentSession().get(key)).add(object);
    }

    public static void removeObjectFromSerenitySessionList(String key,Object object){
        ((List<Object>)Serenity.getCurrentSession().get(key)).remove(object);
    }

    public static <T> T getFromSession(String key){
        return (T)Serenity.getCurrentSession().get(key);
    }
}
