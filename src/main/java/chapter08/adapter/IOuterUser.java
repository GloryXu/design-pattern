package chapter08.adapter;

import java.util.Map;

/**
 * 外部的人员信息
 */
public interface IOuterUser {
    Map<String, String> getUserBaseInfo();

    Map<String, String> getUserOfficeInfo();

    Map<String, String> getUserHomeInfo();
}
