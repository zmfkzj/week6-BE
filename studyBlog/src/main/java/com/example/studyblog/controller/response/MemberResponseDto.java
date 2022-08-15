package com.example.studyblog.controller.response;

import java.time.LocalDateTime;

import com.example.studyblog.domain.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {
  private Long id;
  private String memberId;
  private String nickname;
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;
}
