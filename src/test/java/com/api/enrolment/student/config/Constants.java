package com.api.enrolment.student.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@Component
@PropertySource("classpath:bdd.properties")
public class Constants {

    @Value("${datasource.url}")
    private String datasourceURL;
    @Value("${datasource.driver.name}")
    private String datasourceDriver;
    @Value("${datasource.username}")
    private String datasourceUser;
    @Value("${datasource.password}")
    private String datasourcePassword;
    @Value("${create.student}")
    private String createStudent;
    @Value("${update.student}")
    private String updateStudent;
    @Value("${get.student}")
    private String getStudent;
    @Value("${delete.student}")
    private String deleteStudent;
    @Value("${base.uri}")
    private String baseURI;
    @Value("${server.port}")
    private String serverPort;
    @Value("${sql.students.id}")
    private String sqlStudentsById;
    @Value("${sql.students.class}")
    private String sqlStudentsByClass;

    public String getDatasourceURL() {
        return datasourceURL;
    }

    public void setDatasourceURL(String datasourceURL) {
        this.datasourceURL = datasourceURL;
    }

    public String getDatasourceUser() {
        return datasourceUser;
    }

    public void setDatasourceUser(String datasourceUser) {
        this.datasourceUser = datasourceUser;
    }

    public String getDatasourcePassword() {
        return datasourcePassword;
    }

    public void setDatasourcePassword(String datasourcePassword) {
        this.datasourcePassword = datasourcePassword;
    }

    public String getCreateStudent() {
        return createStudent;
    }

    public void setCreateStudent(String createStudent) {
        this.createStudent = createStudent;
    }

    public String getUpdateStudent() {
        return updateStudent;
    }

    public void setUpdateStudent(String updateStudent) {
        this.updateStudent = updateStudent;
    }

    public String getGetStudent() {
        return getStudent;
    }

    public void setGetStudent(String getStudent) {
        this.getStudent = getStudent;
    }

    public String getDeleteStudent() {
        return deleteStudent;
    }

    public void setDeleteStudent(String deleteStudent) {
        this.deleteStudent = deleteStudent;
    }

    public String getBaseURI() {
        return baseURI;
    }

    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getSqlStudentsById() {
        return sqlStudentsById;
    }

    public void setSqlStudentsById(String sqlStudentsById) {
        this.sqlStudentsById = sqlStudentsById;
    }

    public String getSqlStudentsByClass() {
        return sqlStudentsByClass;
    }

    public void setSqlStudentsByClass(String sqlStudentsByClass) {
        this.sqlStudentsByClass = sqlStudentsByClass;
    }

    public String getDatasourceDriver() {
        return datasourceDriver;
    }

    public void setDatasourceDriver(String datasourceDriver) {
        this.datasourceDriver = datasourceDriver;
    }
}
