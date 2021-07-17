package com.sbefsf.findspringbugs.test.badpractice;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

// Source from https://www.baeldung.com/jpa-persisting-enums-in-jpa
@Entity
public class InefficientEnumsPersistenceBadCase {
    private enum EnumName {
        A, B, C;
    }

    @Id
    private int id;

    @Enumerated(EnumType.ORDINAL)
    private EnumName status;
}
