package com.sbefsf.findspringbugs.test.badpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

public class ShortlyAnnotatedCollectionTypeInjectionBadCase {
    @Autowired
    @Qualifier("map")
    private Map<String, Object> map;
}
