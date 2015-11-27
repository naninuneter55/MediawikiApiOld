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
public class ImageInfoBuilder extends Builder{

    @Override
    public URI getUri(String... imageTitles) {
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("action", "query"));
        params.add(new BasicNameValuePair("prop", "imageinfo"));
        params.add(new BasicNameValuePair("format", "json"));
        params.add(new BasicNameValuePair("iiprop", "parsedcomment|url"));
        params.add(new BasicNameValuePair("iiurlwidth", "150"));
        params.add(new BasicNameValuePair("titles", String.join("|", imageTitles)));
        return(getUri(params));
    }

    @Override
    public URI getUri(Integer pageId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
