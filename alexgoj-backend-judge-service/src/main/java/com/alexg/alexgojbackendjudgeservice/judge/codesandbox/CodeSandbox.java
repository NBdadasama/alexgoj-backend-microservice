package com.alexg.alexgojbackendjudgeservice.judge.codesandbox;

import com.alexg.alexgojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.alexg.alexgojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
