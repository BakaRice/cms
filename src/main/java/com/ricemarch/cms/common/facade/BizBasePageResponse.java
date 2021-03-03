package com.ricemarch.cms.common.facade;

import com.ricemarch.cms.common.enums.BizEnum;
import com.ricemarch.cms.common.enums.BizErrorCodeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 返回分页基类,前端自己算分页,动态调整每页数量的时候，需要用 offset 和 length
 *
 * @author tanwentao
 */
@Getter
@Setter
@ToString(callSuper = true)
public class BizBasePageResponse<T> extends BizBaseResponse<T> {
    private static final long serialVersionUID = 1L;

    public BizBasePageResponse() {
        super();
    }

    public BizBasePageResponse(BizEnum errorCode) {
        super(errorCode);
    }

    public BizBasePageResponse(BizEnum errorCode, String message) {
        super(errorCode, message);
    }

    public BizBasePageResponse(Integer offSet, Integer length, Integer totalRowNum) {
        super();
        this.offSet = offSet;
        this.length = length;
        this.totalRowNum = totalRowNum;
    }

    public BizBasePageResponse(BizEnum errorCode, Integer offSet, Integer length, Integer totalRowNum) {
        super(errorCode);
        this.offSet = offSet;
        this.length = length;
        this.totalRowNum = totalRowNum;
    }

    public BizBasePageResponse(T data, Integer offSet, Integer length, Integer totalRowNum) {
        super(data);
        this.offSet = offSet;
        this.length = length;
        this.totalRowNum = totalRowNum;
    }

    public BizBasePageResponse(BizEnum errorCode, String message, Integer offSet, Integer length, Integer totalRowNum) {
        super(errorCode, message);
        this.offSet = offSet;
        this.length = length;
        this.totalRowNum = totalRowNum;
    }

    public BizBasePageResponse(BizEnum errorCode, String message, T data, Integer offSet, Integer length,
                               Integer totalRowNum) {
        super(errorCode, message, data);
        this.offSet = offSet;
        this.length = length;
        this.totalRowNum = totalRowNum;
    }

    /**
     * 开始条数（原样返回）
     */
    @ApiModelProperty(value = "开始条数（原样返回）")
    private Integer offSet;

    /**
     * 本次查询条数（原样返回）
     */
    @ApiModelProperty(value = "本次查询条数（原样返回）")
    private Integer length;

    /**
     * 总数据条数
     */
    @ApiModelProperty(value = "总数据条数")
    private Integer totalRowNum;

    public static BizBasePageResponse success() {
        return new BizBasePageResponse();
    }

    public static BizBasePageResponse success(String message) {
        return new BizBasePageResponse(BizErrorCodeEnum.SUCCESS, message);
    }

    public static BizBasePageResponse success(Integer offSet, Integer length, Integer totalRowNum) {
        return new BizBasePageResponse(offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> success(T data, Integer offSet, Integer length, Integer totalRowNum) {
        return new BizBasePageResponse(data, offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> success(String message, Integer offSet, Integer length,
                                                     Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.SUCCESS, message, offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> success(String message, T data, Integer offSet, Integer length,
                                                     Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.SUCCESS, message, data, offSet, length, totalRowNum);
    }

    public static BizBasePageResponse operationFailed() {
        return new BizBasePageResponse(BizErrorCodeEnum.OPERATION_FAILED);
    }

    public static BizBasePageResponse operationFailed(String message) {
        return new BizBasePageResponse(BizErrorCodeEnum.OPERATION_FAILED, message);
    }

    public static <T> BizBasePageResponse<T> operationFailed(T data, Integer offSet, Integer length,
                                                             Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.OPERATION_FAILED, BizErrorCodeEnum.OPERATION_FAILED.getDesc(),
                data, offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> operationFailed(String message, Integer offSet, Integer length,
                                                             Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.OPERATION_FAILED, message, offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> operationFailed(String message, T data, Integer offSet, Integer length,
                                                             Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.OPERATION_FAILED, message, data, offSet, length, totalRowNum);
    }

    public static BizBasePageResponse systemError() {
        return new BizBasePageResponse(BizErrorCodeEnum.SYSTEM_ERROR);
    }

    public static BizBasePageResponse systemError(String message) {
        return new BizBasePageResponse(BizErrorCodeEnum.SYSTEM_ERROR, message);
    }

    public static <T> BizBasePageResponse<T> systemError(T data, Integer offSet, Integer length, Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.SYSTEM_ERROR, BizErrorCodeEnum.SYSTEM_ERROR.getDesc(), data,
                offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> systemError(String message, Integer offSet, Integer length,
                                                         Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.SYSTEM_ERROR, message, offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> systemError(String message, T data, Integer offSet, Integer length,
                                                         Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.SYSTEM_ERROR, message, data, offSet, length, totalRowNum);
    }

    public static BizBasePageResponse paramError() {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_ERROR);
    }

    public static BizBasePageResponse paramError(String message) {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_ERROR, message);
    }

    public static <T> BizBasePageResponse<T> paramError(T data, Integer offSet, Integer length, Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_ERROR, BizErrorCodeEnum.PARAM_ERROR.getDesc(), data,
                offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> paramError(String message, Integer offSet, Integer length,
                                                        Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_ERROR, message, offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> paramError(String message, T data, Integer offSet, Integer length,
                                                        Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_ERROR, message, data, offSet, length, totalRowNum);
    }

    public static BizBasePageResponse paramIsNull() {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_IS_NULL);
    }

    public static BizBasePageResponse paramIsNull(String message) {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_IS_NULL, message);
    }

    public static <T> BizBasePageResponse<T> paramIsNull(T data, Integer offSet, Integer length, Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_IS_NULL, BizErrorCodeEnum.PARAM_IS_NULL.getDesc(), data,
                offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> paramIsNull(String message, Integer offSet, Integer length,
                                                         Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_IS_NULL, message, offSet, length, totalRowNum);
    }

    public static <T> BizBasePageResponse<T> paramIsNull(String message, T data, Integer offSet, Integer length,
                                                         Integer totalRowNum) {
        return new BizBasePageResponse(BizErrorCodeEnum.PARAM_IS_NULL, message, data, offSet, length, totalRowNum);
    }
}
