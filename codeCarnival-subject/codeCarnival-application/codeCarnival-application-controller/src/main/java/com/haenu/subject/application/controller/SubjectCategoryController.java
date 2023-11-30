package com.haenu.subject.application.controller;

import com.haenu.subject.application.convert.SubjectCategoryDTOConverter;
import com.haenu.subject.application.dto.SubjectCategoryDTO;
import com.haenu.subject.common.entity.Result;
import com.haenu.subject.domain.entity.SubjectCategoryBo;
import com.haenu.subject.domain.service.SubjectCategoryDomainService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/subject/category")
public class SubjectCategoryController {
    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {
        try {
            SubjectCategoryBo subjectCategoryBo = SubjectCategoryDTOConverter.INSTANCE.convertBoToCategory(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBo);
            return Result.ok();
        } catch (Exception e) {
            return Result.fail();
        }
    }

}
