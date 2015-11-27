/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.mediawiki_api;

import com.wind_now.mediawiki_api.beans.CategoryMembers;
import com.wind_now.mediawiki_api.beans.ImageInfo;
import com.wind_now.mediawiki_api.beans.Page;
import com.wind_now.mediawiki_api.beans.PageInfo;
import com.wind_now.mediawiki_api.query.Builder;
import com.wind_now.mediawiki_api.query.CategoryMembersBuilder;
import com.wind_now.mediawiki_api.query.PageInfoBuilder;
import com.wind_now.mediawiki_api.query.Director;
import com.wind_now.mediawiki_api.query.ImageInfoBuilder;
import com.wind_now.mediawiki_api.query.PageBuilder;
import java.io.Serializable;

/**
 *
 * @author ono
 */
public class Query implements Serializable{

    public PageInfo getPageInfo(Integer pageId) {
        return(this.get(pageId, new PageInfoBuilder(), PageInfo.class));
    }

    public Page getPage(Integer pageId) {
        return(this.get(pageId, new PageBuilder(), Page.class));
    }

    public CategoryMembers getCategoryMembers(Integer pageId) {
        return(this.get(pageId, new CategoryMembersBuilder(), CategoryMembers.class));
    }

    public ImageInfo getImageInfo(String... imageTitles) {
        return(this.get(imageTitles, new ImageInfoBuilder(), ImageInfo.class));
    }

    private <T, S> T get(S arg, Builder builder, Class<T> clazz){
        T result;
        Director director = new Director(builder);
        result = (T)director.construct(arg, clazz);
        return result;
    }
}
