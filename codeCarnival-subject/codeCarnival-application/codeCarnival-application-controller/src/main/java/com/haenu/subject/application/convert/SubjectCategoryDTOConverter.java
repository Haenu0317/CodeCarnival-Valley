package com.haenu.subject.application.convert;

import com.haenu.subject.application.dto.SubjectCategoryDTO;
import com.haenu.subject.domain.entity.SubjectCategoryBo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectCategoryDTOConverter {
    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    SubjectCategoryBo convertBoToCategory(SubjectCategoryDTO subjectCategoryDTO);
}
