package com.alexg.alexgojbackendjudgeservice.judge.strategy;

import com.alexg.alexgojbackendmodel.model.codesandbox.JudgeInfo;
import com.alexg.alexgojbackendmodel.model.dto.question.JudgeCase;
import com.alexg.alexgojbackendmodel.model.entity.Question;
import com.alexg.alexgojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
