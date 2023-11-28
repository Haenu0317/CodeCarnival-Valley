package com.haenu.subject.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haenu.subject.infra.basic.entity.SubjectCategory;
import com.haenu.subject.infra.basic.mapper.SubjectCategoryMapper;
import com.haenu.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.stereotype.Service;

/**
* @author Haenu0317
* @description 针对表【subject_category(题目分类)】的数据库操作Service实现
* @createDate 2023-11-28 20:21:30
*/
@Service
public class SubjectCategoryServiceImpl extends ServiceImpl<SubjectCategoryMapper, SubjectCategory>
    implements SubjectCategoryService {

}




