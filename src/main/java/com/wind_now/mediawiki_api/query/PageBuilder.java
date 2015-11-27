/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.mediawiki_api.query;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author ono
 */
public class PageBuilder extends Builder{
    @Override
    public URI getUri(Integer pageId) {
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("action", "query"));
        params.add(new BasicNameValuePair("list", "backlinks"));
        params.add(new BasicNameValuePair("prop", "categories|extlinks|extracts|images|info|langlinks|links|pageimages|pageterms|templates"));
        params.add(new BasicNameValuePair("format", "json"));
        params.add(new BasicNameValuePair("blpageid", pageId.toString()));
        params.add(new BasicNameValuePair("bllimit", "500"));
        params.add(new BasicNameValuePair("cllimit", "500"));
        params.add(new BasicNameValuePair("ellimit", "500"));
        params.add(new BasicNameValuePair("explaintext", ""));
        params.add(new BasicNameValuePair("imlimit", "500"));
        params.add(new BasicNameValuePair("inprop", "watchers|url|displaytitle"));
        params.add(new BasicNameValuePair("llprop", "url"));
        params.add(new BasicNameValuePair("lllang", "en"));
        params.add(new BasicNameValuePair("pllimit", "500"));
        params.add(new BasicNameValuePair("pithumbsize", "900"));
        params.add(new BasicNameValuePair("pilimit", "50"));
        params.add(new BasicNameValuePair("tllimit", "500"));
        params.add(new BasicNameValuePair("pageids", pageId.toString()));
        return(getUri(params));
    }

    @Override
    public URI getUri(String[] titles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
