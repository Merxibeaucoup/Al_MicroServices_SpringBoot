package com.edgar.school.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolRepsonse {

	private String name;

	private String email;

	private List<Students> students;

}
