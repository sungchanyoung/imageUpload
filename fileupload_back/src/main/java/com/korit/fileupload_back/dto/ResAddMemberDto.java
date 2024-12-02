package com.korit.fileupload_back.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResAddMemberDto {

    private  boolean isSuccess;
    private Long memberId;

}
