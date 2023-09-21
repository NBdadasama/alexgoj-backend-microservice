package com.alexg.alexgojbackendjudgeservice.judge;

import com.alexg.alexgojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.alexg.alexgojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.alexg.alexgojbackendjudgeservice.judge.strategy.JudgeContext;
import com.alexg.alexgojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.alexg.alexgojbackendmodel.model.codesandbox.JudgeInfo;
import com.alexg.alexgojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
