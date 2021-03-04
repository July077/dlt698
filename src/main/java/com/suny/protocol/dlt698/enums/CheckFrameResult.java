package com.suny.protocol.dlt698.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author sunjianrong
 * @date 2021-03-04 11:50
 */
@Getter
@AllArgsConstructor
public enum CheckFrameResult {

    /**
     *
     */
    LEGAL_FORMAT(0),
    /**
     * null或不是16进制
     */
    NULL_OR_NOT_HEX(-1),
    /**
     * 长度不对，最少也要12字节，或者字符串长度为奇数
     */
    INVALID_LENGTH(-2),
    /**
     * 帧起始码、帧结束码 格式不对
     */
    INVALID_START_OR_END_SIGN(-3),
    /**
     * 长度域值与 该帧字符串不符合
     */
    LENGTH_NOT_MATCH(-4),
    /**
     * 帧头校验HCS 不符
     */
    HCS_CHECK_NOT_MATCH(-5),
    /**
     * 帧校验FCS 不符
     */
    FCS_CHECK_NOT_MATCH(-6);

    private final int code;
}
