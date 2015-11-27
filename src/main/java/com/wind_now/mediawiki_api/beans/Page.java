/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.mediawiki_api.beans;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 *
 * @author ono
 */
@Data
public class Page implements Serializable {

    @SerializedName("batchcomplete")
    private String batchComplete;

    @SerializedName("continue")
    private Continue_ continue_;

    @Data
    public class Continue_{
        @SerializedName("blcontinue")
        private String blContinue;
        @SerializedName("plcontinue")
        private String plContinue;
        @SerializedName("continue")
        private String continue_;
    }

    @SerializedName("query")
    private Query query;

    @Data
    public class Query {
        private Map<Integer, PageDetail> pages;
        @SerializedName("backlinks")
        private List<Backlink> backLinks;
    }

    @Data
    public class PageDetail {
        @SerializedName("pageid")
        private Integer pageId;
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
        @SerializedName("categories")
        private List<Category> categories;
        @SerializedName("extlinks")
        private List<ExtLink> extLinks;
        @SerializedName("extract")
        private String extract;
        @SerializedName("images")
        private List<Image> images;
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
        @SerializedName("displaytitle")
        private String displayTitle;
        @SerializedName("langlinks")
        private List<Langlink> langLinks;
        @SerializedName("links")
        private List<Link> links;
        @SerializedName("thumbnail")
        private Thumbnail thumbnail;
        @SerializedName("pageimage")
        private String pageImage;
        @SerializedName("terms")
        private Terms terms;
        @SerializedName("templates")
        private List<Template> templates;
    }

    @Data
    public class Category{
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
    }
    
    @Data
    public class ExtLink{
        @SerializedName("*")
        private String extlink;
   }
    @Data
    public class Image{
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
    }
    @Data
    public class Langlink{
        @SerializedName("lang")
        private String lang;
        @SerializedName("url")
        private String url;
        @SerializedName("*")
        private String title;
    }
    @Data
    public class Link{
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
    }
    @Data
    public class Thumbnail{
        @SerializedName("source")
        private String source;
        @SerializedName("width")
        private String width;
        @SerializedName("height")
        private String height;
    }
    @Data
    public class Terms{
        @SerializedName("alias")
        private List<String> alias;
        @SerializedName("label")
        private List<String> label;
    }
    @Data
    public class Template{
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
    }
    @Data
    public class Backlink{
        @SerializedName("pageid")
        private String pageId;
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
    }
    
}
