/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.mediawiki_api.query;

import java.net.URI;

/**
 *
 * @author ono
 */
public class Director {
    private String url;
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    
    public <T, S> Object construct(T arg, Class<S> clazz){
        Object result = null;
        if(arg instanceof Integer){
            Integer pageId = (Integer)arg;
            URI uri = builder.getUri(pageId);
            result = builder.getResult(uri.toString(), clazz);
        }
        if(arg instanceof String[]){
            String[] titles = (String[])arg;
            URI uri = builder.getUri(titles);
            result = builder.getResult(uri.toString(), clazz);
        }
        return result;
    }
    
}
