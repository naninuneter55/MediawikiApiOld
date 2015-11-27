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
public class CategoryMembers implements Serializable {

    @SerializedName("batchcomplete")
    private String batchComplete;
    @SerializedName("continue")
    private Continue contineu_;
    @SerializedName("query")
    private Query query;

    @Data
    public class Continue {
        @SerializedName("cmcontinue")
        private String cmContinue;
        @SerializedName("continue")
        private String continue_;
    }
    
    @Data
    public class Query {
        @SerializedName("pages")
        private Map<Integer, PageInfo> pages;
        @SerializedName("categorymembers")
        private List<CategoryMember> categoryMembers;
    }

    @Data
    public class PageInfo {
        @SerializedName("pageid")
        private Integer pageId;
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
    }

    @Data
    public class CategoryMember {
        @SerializedName("pageId")
        private String pageid;
        @SerializedName("ns")
        private String ns;
        @SerializedName("title")
        private String title;
        @SerializedName("sortKey")
        private String sortkey;
        @SerializedName("sortKeyPrefix")
        private String sortkeyprefix;
        @SerializedName("type")
        private String type;
        @SerializedName("timestamp")
        private String timestamp;
    }
}
