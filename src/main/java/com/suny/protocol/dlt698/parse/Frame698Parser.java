package com.suny.protocol.dlt698.parse;

import com.suny.protocol.dlt698.enums.CheckFrameResult;

/**
 * @author sunjianrong
 * @date 2021-03-04 11:46
 */
public class Frame698Parser {

    public String parser(String message) {
        return "";
    }


    private CheckFrameResult checkFrame(String message) {
        return CheckFrameResult.LEGAL_FORMAT;
    }
}
