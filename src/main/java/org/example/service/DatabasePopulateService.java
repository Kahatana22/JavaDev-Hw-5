package org.example.service;

import org.example.entities.Client;
import org.example.entities.Project;
import org.example.entities.ProjectWorker;
import org.example.entities.Worker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DatabasePopulateService {

    private PreparedStatement prepareStatement(String sql) throws SQLException {
        Connection connection = Database.getInstance().getConnection();
        return connection.prepareStatement(sql);
    }
    public void createWorker(List<Worker> workers) {
        String sql = "INSERT INTO worker (name, birthday, level, salary) VALUES (?, ?, ?, ?)";

        try(PreparedStatement pst = prepareStatement(sql)) {

            for (Worker worker : workers) {
                pst.setString(1, worker.getName());
                pst.setObject(2, worker.getBirthday());
                pst.setString(3, worker.getLevel());
                pst.setInt(4, worker.getSalary());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createClient(List<Client> clients) {
        String sql = "INSERT INTO client (name) VALUES (?)";

        try(PreparedStatement pst = prepareStatement(sql)) {

            for (Client client : clients) {
                pst.setString(1, client.getName());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createProject(List<Project> projects) {
        String sql = "INSERT INTO project(client_id, start_date, finish_date) VALUES (?, ?, ?)";

        try(PreparedStatement pst = prepareStatement(sql)) {

            for (Project project : projects) {
                pst.setLong(1, project.getClientId());
                pst.setObject(2, project.getStartDate());
                pst.setObject(3, project.getFinishDate());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createProjectWorker(List<ProjectWorker> projectWorkers) {
        String sql = "INSERT INTO project_worker (PROJECT_ID, WORKER_ID) VALUES (?, ?)";

        try(PreparedStatement pst = prepareStatement(sql)) {

            for (ProjectWorker pw : projectWorkers) {
                pst.setInt(1, pw.getProjectId());
                pst.setInt(2, pw.getWorkerId());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}