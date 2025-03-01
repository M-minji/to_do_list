package com.green.todo.board.model.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class GetBoardMiniRes {
    @Schema(example = "1", description = "보드 id")
    private Long boardId;

    //얘는 달력에서 정렬떄문에
    @Schema(example = "1", description = "캘린더 id")
    private Long calendarId;
    @Schema(example = "1", description = "캘린더 색상")
    private Long color;
    @Schema(example = "title", description = "글 제목")
    private String title;
    @Schema(example = "content", description = "글 내용")
    private String content;
    @Schema(example = "2024-04-11", description = "일정 시작일")
    private String startDay;
    @Schema(example = "2024-04-12", description = "일정 마감일")
    @JsonProperty("dDay")
    private String dDay;
}
