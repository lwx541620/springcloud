package com.imooc.product.utils;

import com.imooc.product.vo.ResultVO;

public class ResultVOUtil {
    public static ResultVO success(Object obj){
        ResultVO resultVO=new ResultVO();
        resultVO.setCoe(0);
        resultVO.setMsg("success");
        resultVO.setData(obj);
        return resultVO;
   }
}
