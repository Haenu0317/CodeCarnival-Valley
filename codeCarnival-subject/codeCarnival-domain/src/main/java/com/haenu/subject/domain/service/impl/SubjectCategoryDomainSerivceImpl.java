package com.haenu.subject.domain.service.impl;

import com.haenu.subject.domain.convert.SubjectCategoryConverter;
import com.haenu.subject.domain.entity.SubjectCategoryBo;
import com.haenu.subject.domain.service.SubjectCategoryDomainService;
import com.haenu.subject.infra.basic.entity.SubjectCategory;
import com.haenu.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SubjectCategoryDomainSerivceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    public SubjectCategory add(SubjectCategoryBo subjectCategoryBo) {
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convertBoToCategory(subjectCategoryBo);
        subjectCategoryService.save(subjectCategory);
        return subjectCategory;
    }
}
