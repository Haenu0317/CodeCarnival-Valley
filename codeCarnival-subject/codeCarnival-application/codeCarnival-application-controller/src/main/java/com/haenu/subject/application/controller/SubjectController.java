package com.haenu.subject.application.controller;

import com.haenu.subject.infra.basic.entity.SubjectCategory;
import com.haenu.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 刷题的Controller
 */
@RestController
public class SubjectController {
    @Resource
    private SubjectCategoryService subjectCategoryService;
    @GetMapping("/test")
    public String test(){
        SubjectCategory subjectCategory = subjectCategoryService.getById(1L);
        return subjectCategory.getCategoryName();
    }

}
