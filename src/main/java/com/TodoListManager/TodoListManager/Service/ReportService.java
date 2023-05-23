package com.TodoListManager.TodoListManager.Service;

import com.TodoListManager.TodoListManager.DTO.TodoListManagerDTO;
import com.TodoListManager.TodoListManager.Model.UserRegister;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {
    @Autowired
    UserRegisterService userRegisterService;
    @Autowired
    TodosService todosService;

    public static final String pathToReports = "C:\\Users\\User003\\Downloads\\report";

    public String TodoListManagerDTO() throws FileNotFoundException, JRException {
        List<UserRegister> userRegisterList = userRegisterService.getAllUser();
        List<TodoListManagerDTO> todoListManagerDTOS = new ArrayList<>();

        for(UserRegister userRegister: userRegisterList){
            String courseName = markList1.getCourse().getName();
            Integer obtainedMark = markList1.getObtainedMarks();
            String grade = markList1.getGrade();
            CourseDTO courseDTO = new CourseDTO(courseName,obtainedMark,grade);
            CourseDTOList.add(courseDTO);
        }
        File file = new File("C:\\Users\\User003\\Downloads\\firstSpringDemo\\firstSpringDemo\\src\\main\\resources\\CourseReport.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(CourseDTOList);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "MyName");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,paramters , dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports+"\\courseReport.pdf");
        return "Report generated : " + pathToReports+"\\courseReport.pdf";
    }

}
