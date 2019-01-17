package com.cg.mini.main;

import java.util.Scanner;

import com.cg.mini.exceptions.FMSException;

import com.cg.mini.model.FacultySkillModel;
import com.cg.mini.service.FMSService;
import com.cg.mini.service.FMSServiceImpl;

public class UiClass {

	public static void main(String[] args) throws FMSException {
		Scanner scanner = new Scanner(System.in);
		boolean result1 = false;
		int choice;

		do {
			System.out.println("Enter Username");
			String username = scanner.nextLine();
			System.out.println("Enter Password");

			String password = scanner.nextLine();

			FMSService service = new FMSServiceImpl();

			result1 = service.validateFields(username, password);

			if (result1 == true) {
				System.out.println("=====Training Admin Console=====");
				System.out.println("1.Faculty Skill Maintenance");
				System.out.println("2.Course Maintenance");
				System.out.println("3.View Feedback Report");
				System.out.println("Enter choice:");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:

					FacultySkillModel facultySkillModel = new FacultySkillModel();
					int facultyId = 0;
					boolean validateFlag = false;
					do {

						System.out.println("Enter Faculty ID");
						facultyId = scanner.nextInt();
						validateFlag = service.validation(facultyId);

					} while (!validateFlag);

					scanner.nextLine();
					System.out.println("Enter Skills ");
					String skillSet = scanner.nextLine();

					facultySkillModel.setFacultyId(facultyId);
					facultySkillModel.setSkillSet(skillSet);

					int result = service
							.addFacultySkillModel(facultySkillModel);
					System.out.println(result + "inserted");

					break;

				case 2:

					break;

				case 3:

					break;

				default:
					System.out.println("Invalid Input");
					break;
				}

			} else {
				System.out.println("Unauthorized access");
			}

		} while (!result1 == true);
		scanner.close();
	}

}
