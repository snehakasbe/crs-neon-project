package com.neon.dao;
/**
 * @author user361
 * Admin DAO Interface.
 */
public interface AdminDao  {
	
		/**
		 * Generate report card method.
		 */
		public void  generateReportCard();
		/**
		 * Add professor method.
		 */
		public void addProfessor();
		/**
		 * Approve student registration method.
		 */
		public void approveStudentResistration();
		/**
		 * Add course method.
		 */
		public void addCourse();
		/**
		 * Remove course method.
		 */
		public void removeCourse();
}
