package com.wind_now.mediawiki_api;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.wind_now.mediawiki_api.beans.CategoryMembers;
import com.wind_now.mediawiki_api.beans.ImageInfo;
import com.wind_now.mediawiki_api.beans.Page;
import com.wind_now.mediawiki_api.beans.PageInfo;
import com.wind_now.mediawiki_api.util.OnoLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author ono
 */
public class WikiTest {

    static final Logger logger = OnoLogger.getLogger();

    public WikiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPageInfo method, of class Wiki.
     */
//    @Ignore
    @Test
    public void testGetPageInfo() {

        logger.info("getPageInfo");
        Integer pageId = 34112;
        Query query = new Query();
        PageInfo result = query.getPageInfo(pageId);
        assertEquals(pageId, result.getQuery().getPages().get(pageId).getPageId());
    }

//    @Ignore
    @Test
    public void testGetPage() {

        Page.PageDetail pd;

        logger.info("getPage");
        Integer pageId = 34112;
        Query query = new Query();
        Page page = query.getPage(pageId);
        assertEquals(pageId, page.getQuery().getPages().get(pageId).getPageId());
        logger.info(page.getQuery().toString());
        pd = page.getQuery().getPages().get(pageId);
        logger.info(pd.getCategories().toString());
        logger.info(pd.getExtract());
        logger.info(pd.getImages().toString());
        logger.info(pd.getLangLinks().toString());
        logger.info(pd.getLinks().toString());
        logger.info(pd.getThumbnail().toString());
        logger.info(pd.getTerms().toString());
        logger.info(pd.getTemplates().toString());
        logger.info(page.getQuery().getBackLinks().toString());
//        pageId = "26748";
//        page = wiki.getPage(pageId);
//        assertEquals(pageId, page.getQuery().getPages().get(pageId).getPageid());
    }

//    @Ignore
    @Test
    public void testGetCategoryMembers() {
        logger.info("getCategoryMembers");
        Integer pageId = 308788;
        Query query = new Query();
        CategoryMembers cm = query.getCategoryMembers(pageId);
        assertEquals(pageId, cm.getQuery().getPages().get(pageId).getPageId());
        logger.info(cm.getQuery().getCategoryMembers().toString());
    }

//    @Ignore
    @Test
    public void testgetImageInfo() throws Exception {

        logger.info("getImageInfo");
        String[] titles = {
            "ファイル:Viola d'amore.png",
            "ファイル:吹奏楽編成による演奏風景 20060416 001.jpg"
        };
        Query query = new Query();
        ImageInfo ii = query.getImageInfo(titles);
        List<Integer> pageIds = new ArrayList<>(ii.getQuery().getPages().keySet());
        IntStream.range(0, ii.getQuery().getPages().size())
                .forEach(i -> {
                    try {
                        assertEquals(
                                titles[i],
                                ii.getQuery().getPages().get(pageIds.get(i)).getTitle()
                        );
                        logger.info(ii.getQuery().getPages().get(pageIds.get(i)).toString());
                    } catch (Exception ex) {
                        logger.severe(ex.toString());
                    }
                }
                );
    }
}
