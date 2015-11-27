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
public class ImageInfo implements Serializable {

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
        @SerializedName("missing")
        private String missing;
        @SerializedName("imagerepository")
        private String imageRepository;
        @SerializedName("imageinfo")
        private List<ImageInfoDatail> imageInfoDetail;
    }
    @Data
    public class ImageInfoDatail{
        @SerializedName("parsedcomment")
        private String parsedComment;
        @SerializedName("thumburl")
        private String thumbUrl;
        @SerializedName("thumbwidth")
        private String thumbWidth;
        @SerializedName("thumbheight")
        private String thumbHeight;
        @SerializedName("url")
        private String url;
        @SerializedName("descriptionurl")
        private String descriptionUrl;
    }
}
