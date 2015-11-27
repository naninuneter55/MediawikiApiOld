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
public class CategoryMembersBuilder extends Builder{
    @Override
    public URI getUri(Integer pageId) {
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("action", "query"));
        params.add(new BasicNameValuePair("list", "categorymembers"));
        params.add(new BasicNameValuePair("format", "json"));
        params.add(new BasicNameValuePair("cmpageid", pageId.toString()));
        params.add(new BasicNameValuePair("cmprop", "ids|title|sortkey|sortkeyprefix|type|timestamp"));
        params.add(new BasicNameValuePair("pageids", pageId.toString()));
        return(getUri(params));
    }

    @Override
    public URI getUri(String[] titles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
