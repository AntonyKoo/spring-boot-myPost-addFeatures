package com.example.intermediate.controller.response;

import java.time.LocalDateTime;
import java.util.List;

import com.example.intermediate.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostResponseDto {
  private Long id;
  private String title;
  private String content;  // 추후 수정사항 => 게시글 전체 조회에서는 글제목만 보여줘야 함
  private String author;
  private List<CommentResponseDto> commentResponseDtoList;
  private LocalDateTime createdAt;  // 추후 수정사항2 => 사실 createdAt으로 조회하되 modified로 바뀔 수 있어야 함
  private LocalDateTime modifiedAt;

}
