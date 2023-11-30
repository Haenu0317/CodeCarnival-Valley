package com.haenu.subject.domain.convert;

import com.haenu.subject.domain.entity.SubjectCategoryBo;
import com.haenu.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectCategoryConverter {
    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategory convertBoToCategory(SubjectCategoryBo subjectCategoryBo);
}
