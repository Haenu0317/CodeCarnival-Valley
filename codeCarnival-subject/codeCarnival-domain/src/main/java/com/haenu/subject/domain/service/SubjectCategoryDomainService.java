package com.haenu.subject.domain.service;

import com.haenu.subject.domain.entity.SubjectCategoryBo;
import com.haenu.subject.infra.basic.entity.SubjectCategory;

public interface SubjectCategoryDomainService {

    SubjectCategory add(SubjectCategoryBo subjectCategoryBo);
}
