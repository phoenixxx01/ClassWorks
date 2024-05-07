package demo_project.service.impl;

import demo_project.model.Applicants;
import demo_project.service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {


    @Override
    public void displayApplicantData(Applicants applicants) {
        System.out.println("FullName: " + applicants.getName() + "\n" + "Gender: " + applicants.getGender() + "\n" +
                "Age: " + applicants.getAge());
    }

    @Override
    public void admitStudent(Applicants applicants) {

    }
}
