package com.henry.springbootmall.util;

import lombok.Data;

import java.util.List;

/**
 * ClassName: page
 * Package: com.henry.springbootmall.util
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/15 下午 02:58
 * @Version 1.0
 */
@Data
public class Page<T> {

    private Integer limit;
    private Integer offset;
    private Integer total;
    private List<T> results;
}
