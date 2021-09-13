package com.codesample.academy.data;

public class Classes {
// 수업아이디, 수업이름, 강사, 신청인원/최대인원, 설명, 수업일정(시작일, 종료일, 수업요일)
		private String lessonId;
		private String lessonName;
		private String teacher;
		private Integer applicant;
		private Integer maxApplicant;
		private String explanation;
		private String schedule;	
		
		public Classes() {}
		public Classes(String lessonId, String lessonName, 
				       String teacher, Integer applicant, 
				       Integer maxApplicant, String explanation, 
				       String schedule) {
			this.lessonId = lessonId;
			this.lessonName = lessonName;
			this.teacher = teacher;
			this.applicant = applicant;
			this.maxApplicant = maxApplicant;
			this.explanation = explanation;
			this.schedule = schedule;
		}
		
		
		public String getLessonId() {
			return lessonId;
		}
		public void setLessonId(String lessonId) {
			this.lessonId = lessonId;
		}
		
		public String getLessonName() {
			return lessonName;
		}
		public void setLessonName(String lessonName) {
			this.lessonName = lessonName;
		}
		
		public String getTeacher() {
			return teacher;
		}
		public void setTeacher(String teacher) {
			this.teacher = teacher;
		}
		
		public Integer getApplicant() {
			return applicant;
		}
		public void setApplicant(Integer applicant) {
			this.applicant = applicant;
		}
		
		public Integer getMaxApplicant() {
			return maxApplicant;
		}
		public void setMaxApplicant(Integer maxApplicant) {
			this.maxApplicant = maxApplicant;
		}
		
		public String getExplanation() {
			return explanation;
		}
		public void setExplanation(String explanation) {
			this.explanation = explanation;
		}
		
		public String getSchedule() {
			return schedule;
		}
		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}
		
}
