package org.example.service;

import org.example.entities.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatabaseQueryService {

    public List<MaxProjectCountClient> findMaxProjectsClient() {
        List<MaxProjectCountClient> maxProjectCountClients = new ArrayList<>();

        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement()) {
            String sql = Files.readString(Path.of("src/main/resources/sql/find_max_projects_client.sql"));
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int projectCount = resultSet.getInt("project_count");
                maxProjectCountClients.add(new MaxProjectCountClient(name, projectCount));
            }
            resultSet.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return maxProjectCountClients;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> maxSalaryWorkers = new ArrayList<>();

        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement()) {
            String sql = Files.readString(Path.of("src/main/resources/sql/find_max_salary_worker.sql"));
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int salary = resultSet.getInt("salary");
                maxSalaryWorkers.add(new MaxSalaryWorker(name, salary));
            }
            resultSet.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return maxSalaryWorkers;
    }

    public List<LongestProject> findLongestProject() {
        List<LongestProject> longestProjects = new ArrayList<>();

        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement()) {
            String sql = Files.readString(Path.of("src/main/resources/sql/find_longest_project.sql"));
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int monthCount = resultSet.getInt("PROJECT_COUNT");
                longestProjects.add(new LongestProject(name, monthCount));
            }
            resultSet.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return longestProjects;
    }

    public List<YoungestEldestWorker> findYoungestEldestWorker() {
        List<YoungestEldestWorker> youngestEldestWorkers = new ArrayList<>();

        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement()) {
            String sql = Files.readString(Path.of("src/main/resources/sql/find_youngest_eldest_workers.sql"));
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String type = resultSet.getString("type");
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");
                youngestEldestWorkers.add(new YoungestEldestWorker(type, name, birthday));
            }
            resultSet.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return youngestEldestWorkers;
    }

    public List<PrintProjectPrice> printProjectPrice() {
        List<PrintProjectPrice> printProjectPrices = new ArrayList<>();

        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement()) {
            String sql = Files.readString(Path.of("src/main/resources/sql/print_project_prices.sql"));
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                int price = resultSet.getInt("price");
                printProjectPrices.add(new PrintProjectPrice(id, price));
            }
            resultSet.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return printProjectPrices;
    }
}
