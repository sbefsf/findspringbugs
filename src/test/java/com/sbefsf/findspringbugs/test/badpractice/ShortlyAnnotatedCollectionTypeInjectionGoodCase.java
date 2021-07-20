package com.sbefsf.findspringbugs.test.badpractice;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// Source from Pro Spring 5, 5th ed. (83 page)
public class ShortlyAnnotatedCollectionTypeInjectionGoodCase {
    @Resource(name="map")
    private Map<String, Object> map;

    @Resource(name="props")
    private Properties props;

    @Resource(name="set")
    private Set set;

    @Resource(name="list")
    private List list;
}
