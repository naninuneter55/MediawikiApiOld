/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.mediawiki_api.beans;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Map;
import lombok.Data;

/**
 *
 * @author ono
 */
@Data
public class PageInfo implements Serializable {

    @SerializedName("batchcomplete")
    private String batchComplete;

    @SerializedName("query")
    private Query query;

    @Data
    public class Query {

        @SerializedName("pages")
        private Map<Integer, PageDetail> pages;

    }

    @Data
    public class PageDetail {

        @SerializedName("pageid")
        private Integer pageId;
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
        @SerializedName("contentmodel")
        private String contentModel;
        @SerializedName("pagelanguage")
        private String pageLanguage;
        @SerializedName("touched")
        private String touched;
        @SerializedName("lastrevid")
        private String lastRevId;
        @SerializedName("length")
        private String length;
        @SerializedName("watchers")
        private String watchers;
        @SerializedName("fullurl")
        private String fullUrl;
        @SerializedName("editurl")
        private String editUrl;
        @SerializedName("canonicalurl")
        private String canonicalUrl;
    }
}
