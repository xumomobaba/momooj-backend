package com.yupi.mooj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.mooj.mapper.QuestionMapper;
import com.yupi.mooj.model.entity.Question;
import com.yupi.mooj.service.QuestionService;
import org.springframework.stereotype.Service;

/**
 * @author hang
 * @description 针对表【question(题目)】的数据库操作Service实现
 * @createDate 2025-05-30 12:28:32
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
        implements QuestionService {
}




